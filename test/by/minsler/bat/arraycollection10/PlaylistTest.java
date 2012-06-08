package by.minsler.bat.arraycollection10;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class PlaylistTest {

	PlaylistItem i1;
	PlaylistItem i2;
	PlaylistItem i3;
	PlaylistItem i4;
	Playlist myPlaylist;

	@Before
	public void createInstaces() {
		i1 = new PlaylistItem("dima Lubit Kushat'", "c:");
		i2 = new PlaylistItem("dima ne lubit tupo sidet'", "c:");
		i3 = new PlaylistItem("dima clever boy", "c:");
		i4 = new PlaylistItem("dima lu bit", "c:");
		myPlaylist = new Playlist();
		myPlaylist.add(i1);
		myPlaylist.add(i2);
		myPlaylist.add(i3);
		myPlaylist.add(i4);

	}

	@Test
	public void testSearch1() {
		assertEquals(4, myPlaylist.search(".*dima.*").size());
	}

	@Test
	public void testSearch2() {
		assertEquals(2, myPlaylist.search(".*lubit.*").size());
	}

	@Test
	public void testSearcha3() {
		assertEquals(0, myPlaylist.search(".*vasia.*").size());
	}

	@Test
	public void testSearch4() {
		Integer index = myPlaylist.search(".*boy.*").get(0);
		assertEquals(i3.getName(), myPlaylist.get(index).getName());
	}

}
