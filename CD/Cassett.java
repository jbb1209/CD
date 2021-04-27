package CD;
import java.util.ArrayList;
public class Cassett implements AnalogAlbum {
	
	ArrayList<String> songs = new ArrayList<String>();
	int currentIndex;
	// sets songs
	public Cassett(String song1, String song2, String song3, String song4, String song5) {
		songs.add(song1);
		songs.add(song2);
		songs.add(song3);
		songs.add(song4);
		songs.add(song5);
	}
	// play first in list
	public String play() {
		
		if(songs.get(currentIndex) == null)
			return "At the end of the cassett you need to rewind";
		return songs.get(currentIndex);
		
	}
	// go backwards in list once
	public String rewind(){
		
		if(currentIndex == 0)
			return "Fully Re-Wound";
		else {
			
			currentIndex = currentIndex - 1;
			
		    return songs.get(currentIndex);
		}
		
	}
	// go forward in list once
	public String ffwd() {
		
		if(songs.get(currentIndex+1) == null)
			return "At the end of the cassett you need to rewind";
		else {
			
			currentIndex = currentIndex + 1;
			
		    return songs.get(currentIndex);
		}
	}
	// pause the song
	public String pause() {
		
		return "Pausing...";
		
	}
	// stop
	public String stopEject() {
		
		return "Stopping cassett and ejecting";
		
	}

}
