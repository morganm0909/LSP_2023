package org.howard.edu.lspfinal.problem;
import java.util.Set;
import org.junit.Test;
import static org.junit.Assert.*;

public class SongDataBaseTest {
	@Test
	public void TestSongDataBase() {
		SongDatabase db = new SongDatabase();
		db.addSong("Rap", "Savage");
		db.addSong("Rap", "Gin and Juice");
		db.addSong("Jazz", "Always There");
		db.addSong("R&B", "One Wish");
		db.addSong("R&B", "Candy Rain");
		db.addSong("Reggae", "Longing For");
		
		System.out.println(db.getGenreOfSong("Savage")); // prints “Rap”
		System.out.println(db.getGenreOfSong("Always There")); // prints "Jazz"
		System.out.println(db.getGenreOfSong("Candy Rain"));
		System.out.println(db.getGenreOfSong("Longing For"));
	    System.out.println(db.getSongs("R&B"));
	    System.out.println(db.getSongs("Reggae"));
		
		Set<String> songs = db.getSongs("Rap"); // contains Savage and Gin and Juice
		assertTrue(songs.contains("Gin and Juice"));                     
		assertFalse(songs.contains("One Wish"));
		assertTrue("Jazz" == db.getGenreOfSong("Always There"));
		
		Set<String> rsongs = db.getSongs("R&B"); // contains One Wish and Candy Rain
		assertTrue(rsongs.contains("Candy Rain"));
		assertTrue(rsongs.contains("One Wish"));
		
		Set<String> reggae = db.getSongs("Longing For"); // contains Longing For
		assertTrue("Reggae" == db.getGenreOfSong("Longing For"));
		




		
	}

	
}
