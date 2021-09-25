import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.List;

public class ListaFiltro {

  public List<CD> cdComFavorita(List<CD> cds) {
    return cds.stream().filter((CD umCd) =>
      boolean cdComFavorita = umCd.getMusicas().stream().filter((Musica m) => {
        return m.getEstrelas() >=4;
      }).count() > 0;

    return cdComFavoritos;

  }).collect(Collectors.toList());
}

  public static void main(String[] args) {
    CD cd = new CD();

    cd.addMusica(new Musica("nome", 5));
    cd.addMusica(new Musica("nome", 5));
    cd.addMusica(new Musica("nome", 5));

    ListaFiltro lf = new ListaFiltro();  

    List <CD> listaCd = new ArrayList<>();
    listaCd.add(cd);


    System.out.println(cdFavs);
  }
}