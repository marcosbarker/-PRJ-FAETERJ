package bancodados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

public class Principal {

	static final String LISTAR_ALUNOS =  "select * from alunos";
	static final String INSERE_ALUNO = "insert into alunos (nome) values (?)";
	
	public static void main(String[] args) throws SQLException {
		
		Connection conexao = DriverManager.getConnection("jdbc:postgresql://localhost:5432/prj", "postgres", "postgres");	
		
		List<String> novasEntradasDoDePara = Arrays.asList("Gabriel", "Camila", "Matias");
		
		PreparedStatement insert = conexao.prepareStatement(INSERE_ALUNO);
		for (String nome: novasEntradasDoDePara) {
			insert.setString(1, nome);
			insert.execute();
		}
		
		PreparedStatement cmd = conexao.prepareStatement(LISTAR_ALUNOS);
		cmd.execute();
		ResultSet rs = cmd.getResultSet();		
		while (rs.next()) {
			System.out.println(rs.getString(1) + " - " + rs.getString(2));
		}
		
	}
	
}
