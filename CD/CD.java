package CD;

import java.util.ArrayList;

public class CD implements DigitalAlbum{
//varibles
	ArrayList<String> songs = new ArrayList<String>();
	int currentIndex=0;
	// set CD songs
	public CD(String song1, String song2, String song3, String song4, String song5) {
		songs.add(song1);
		songs.add(song2);
		songs.add(song3);
		songs.add(song4);
		songs.add(song5);
	}
	// play from beginning
	public String playFromBeginning() {
		currentIndex = 0;
		return songs.get(currentIndex);
		 
	 }
	// play a specific song by song number
	public String playSong(int num) {
		return songs.get(num);
			
		}
	// go to prev song
	public String prevSong() {
		if(songs.get(currentIndex-1) ==null) {
			currentIndex = 4;
			return "Skipping back and playing: ..."+songs.get(currentIndex);
		}
		else {
			
			currentIndex = currentIndex - 1;
			
		    return "Skipping back and playing: ..."+songs.get(currentIndex);
		}
		
	}
	// go to nect song
	public String nextSong() {
			
		if(songs.get(currentIndex+1) ==null) {
			currentIndex = 0;
			return "Playing "+songs.get(currentIndex);
		}
		else {
			currentIndex = currentIndex - 1;
			
		    return "Playing "+songs.get(currentIndex);
		}
		
		}
	// stop
	public String stop() {
		
		return "Stopping CD and ejecting";
		}
	// pause at a song
	public String pause() {
		return "Pausing...";
		}
}
