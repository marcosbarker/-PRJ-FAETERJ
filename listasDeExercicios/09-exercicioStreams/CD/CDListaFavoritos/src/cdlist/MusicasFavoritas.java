package cdlist;

import java.util.List;
import java.util.stream.Collectors;

public class MusicasFavoritas {

	public List<CD> cdsFavoritos(List<CD> cds) {
		return cds.stream().filter((CD cd1) -> {
			boolean cdComFavorita = cd1.getMusicas().stream().filter((Musica musica) -> {
				return musica.getEstrelas() >= 4;
			}).count() > 0;
			return cdComFavorita;
		}).collect(Collectors.toList());
	}
}