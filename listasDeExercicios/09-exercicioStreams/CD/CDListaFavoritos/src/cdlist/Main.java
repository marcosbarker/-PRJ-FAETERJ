package cdlist;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CD cd = new CD();
		
		cd.addMusica(new Musica("Time After Time.........", 4));
		//cd.addMusica(new Musica("Stairway to the Stars...", 3));
		//cd.addMusica(new Musica("When We Were Young......", 2));
		cd.addMusica(new Musica("Old Folks...............", 4));
		cd.addMusica(new Musica("A Better Place..........", 4));
		cd.addMusica(new Musica("Closer Together.........", 5));
		cd.addMusica(new Musica("Moom River..............", 5));
		//cd.addMusica(new Musica("On the Trail............", 3));
		
		MusicasFavoritas music = new MusicasFavoritas();
		
		List<CD> listaCd = new ArrayList<>();
		listaCd.add(cd);
		
		List<CD> cdFavs = music.cdsFavoritos(listaCd);
		
		System.out.println(cdFavs);
		
	}
}