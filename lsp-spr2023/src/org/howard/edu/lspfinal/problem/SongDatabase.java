package org.howard.edu.lspfinal.problem;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;



public class SongDatabase {
	
	
	private Map<String, HashSet<String>> map = new HashMap<String, HashSet<String>>();
	
	public void addSong(String genre, String songTitle) {
		HashSet<String> songs = map.get(genre);
		if (songs == null) {
            songs = new HashSet<String>();
            map.put(genre, songs);
        }
        songs.add(songTitle);
	}
	
	public Set<String> getSongs(String genre){
		 HashSet<String> songs = map.get(genre);
	     if (songs == null) {
	    	 songs = new HashSet<String>();
	        }
	     return songs;
	}
	
	public String getGenreOfSong(String songTitle) {
		for (String genre : map.keySet()) {
			HashSet<String> songs = map.get(genre);
			if (songs.contains(songTitle)) {
				return genre;
			}
		}
		return null;
	}
	
}
