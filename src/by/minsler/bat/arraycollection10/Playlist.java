package by.minsler.bat.arraycollection10;

import java.util.ArrayList;

public class Playlist {

	private ArrayList<PlaylistItem> pl = new ArrayList<PlaylistItem>();

	public Playlist() {
		super();
	}

	public void add(PlaylistItem song) {
		pl.add(song);
	}

	public ArrayList<Integer> search(String regex) {
		ArrayList<Integer> resultList = new ArrayList<Integer>();
		for (int i = 0; i < pl.size(); i++) {
			String name = pl.get(i).getName().toLowerCase();
			if (name.matches(regex.toLowerCase())) {
				resultList.add(i);
			}
		}
		return resultList;
	}

	public PlaylistItem get(Integer index) {
		return pl.get(index);
	}

}
