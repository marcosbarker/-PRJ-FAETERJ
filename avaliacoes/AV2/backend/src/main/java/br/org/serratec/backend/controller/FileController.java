package br.org.serratec.backend.controller;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import br.org.serratec.backend.message.ResponseFile;
import br.org.serratec.backend.message.ResponseMessage;
import br.org.serratec.backend.model.Aluno;
import br.org.serratec.backend.model.Atividade;
import br.org.serratec.backend.model.FileDB;
import br.org.serratec.backend.repository.AlunoRepository;
import br.org.serratec.backend.repository.AtividadeRepository;
import br.org.serratec.backend.service.AlunoService;
import br.org.serratec.backend.service.AtividadeService;
import br.org.serratec.backend.service.FileStorageService;



@Controller
@CrossOrigin("http://localhost:3000")
public class FileController {

  @Autowired
  private FileStorageService storageService;
  
	@Autowired 
	private AlunoService alunoService;
	
	@Autowired
	private AtividadeRepository  atividadeRepository;
	
	@Autowired
	private AtividadeService atividadeService;
	
  @PostMapping("/upload/{id}")
  public ResponseEntity<ResponseMessage> uploadFile(@PathVariable Long id, @RequestParam("file") MultipartFile file ) {
    String message = "";
    String line = "";
    try {
      storageService.store(file);
      ByteArrayInputStream is = new ByteArrayInputStream(file.getBytes());
      Atividade at = atividadeRepository.findById(id).get();
      StringBuilder builder = new StringBuilder();
      System.out.println("aqui" + id);
      List<Aluno> alunos = new ArrayList<>();
      try (BufferedReader in = new BufferedReader(new InputStreamReader(is))) {
    	  while ((line = in.readLine()) != null) {
        	  String[] values = line.split(",");
        	  Aluno a = new Aluno(null, values[0], values[1], Integer.parseInt(values[2]), Double.parseDouble(values[3]), at);
        	  alunos.add(a);
        	  alunoService.inserir(a);
        	 
          }
    	  
    	  
      }
      
      message = "Uploaded the file successfully: " + file.getOriginalFilename();
      at.setEnviado(true);
      atividadeService.att(at);
      return ResponseEntity.status(HttpStatus.OK).body(new ResponseMessage(message));
    } catch (Exception e) {
      message = "Could not upload the file: " + file.getOriginalFilename() + "!";
      return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).body(new ResponseMessage(message));
    }
  }

  @GetMapping("/files")
  public ResponseEntity<List<ResponseFile>> getListFiles() {
    List<ResponseFile> files = storageService.getAllFiles().map(dbFile -> {
      String fileDownloadUri = ServletUriComponentsBuilder
          .fromCurrentContextPath()
          .path("/files/")
          .path(dbFile.getId())
          .toUriString();

      return new ResponseFile(
          dbFile.getName(),
          fileDownloadUri,
          dbFile.getType(),
          dbFile.getData().length);
    }).collect(Collectors.toList());

    return ResponseEntity.status(HttpStatus.OK).body(files);
  }

  @GetMapping("/files/{id}")
  public ResponseEntity<byte[]> getFile(@PathVariable String id) {
    FileDB fileDB = storageService.getFile(id);

    return ResponseEntity.ok()
        .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + fileDB.getName() + "\"")
        .body(fileDB.getData());
  }
}