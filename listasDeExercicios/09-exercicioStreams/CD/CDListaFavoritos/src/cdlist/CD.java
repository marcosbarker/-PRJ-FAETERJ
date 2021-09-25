package cdlist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CD {

	private List<Musica> musicas = new ArrayList<>();
	
	public List<Musica> getMusicas() {
		return Collections.unmodifiableList(musicas);
	}
	public void addMusica(Musica musica) {
		//System.out.println("Adicionando musicas no CD");
		//System.out.println("\n");
		musicas.add(musica);
	}
	public void removeMusica(Musica musica) {
		musicas.remove(musica);
	}
	public void Clear() {
		musicas.clear();
	}
	public String toString() {
		return "" + musicas;
	}
}