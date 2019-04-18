package model;

import java.util.ArrayList;
import java.util.List;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.image.Image;

public class AlbumList {
	private ObservableList<Album> albums;
	
	public AlbumList() {
		albums = FXCollections.observableArrayList();
	}
	
	public void addAlbum(Album album) {
		albums.add(album);
	}
	
	public ObservableList<Album> getAlbums() {
		return albums;
	}
	
	static public ObservableList<Album> getSample() {
		ObservableList<Album> sample = FXCollections.observableArrayList();
		Album a1 = new Album();
		Album a2 = new Album();
		Album a3 = new Album();
		Album a4 = new Album();
		Album a5 = new Album();
		a1.setName("Teen Dream");
		a1.setDescription("Teen Dream is the third studio album by American dream pop duo Beach House. It is the band's debut album with the record label Sub Pop, who released it on January 26, 2010. The album was produced by the band and Chris Coady.");
		a1.setArtist("Beach House");
		a1.setYear(2010);
		a1.setGenre("Indie");
		a1.setLabel("Sub Pop");
		a1.setLength("48:46");
		a1.setImage(new Image("images/TeenDream.png"));
		List<String> s1 = new ArrayList<String>();
		s1.add("Zebra");
		s1.add("Silver Soul");
		s1.add("Norway");
		s1.add("Walk in the Park");
		s1.add("Used to Be");
		s1.add("Lover of Mine");
		s1.add("Better Times");
		s1.add("10 Mile Stereo");
		s1.add("Real Love");
		s1.add("Take Care");
		a1.setSongs(s1);
		
		a2.setName("Wish You Were Here");
		a2.setDescription("Wish You Were Here is the ninth studio album by the English rock band Pink Floyd, released on 12 September 1975 through Harvest Records and Columbia Records, their first release for the latter. Based on material Pink Floyd composed while performing in Europe, Wish You Were Here was recorded over numerous sessions throughout 1975, at Abbey Road Studios in London.");
		a2.setArtist("Pink Floyd");
		a2.setYear(1975);
		a2.setGenre("Progressive/Art Rock");
		a2.setLabel("Harvest and Columbia");
		a2.setLength("44:36");
		a2.setImage(new Image("images/WishYouWereHere.png"));
		List<String> s2 = new ArrayList<String>();
		s2.add("Shine On You Crazy Diamond");
		s2.add("Welcome to the Machine");
		s2.add("Have a Cigar");
		s2.add("Wish You Were Here");
		a2.setSongs(s2);

		a3.setName("The Kick Inside");
		a3.setDescription("The Kick Inside is the debut studio album by English singer-songwriter and musician Kate Bush. It was released on 17 February 1978 and contains her UK number one hit, \"Wuthering Heights\". The album peaked at number three on the UK Albums Chart and has been certified Platinum by the British Phonographic Industry.");
		a3.setArtist("Kate Bush");
		a3.setYear(1978);
		a3.setGenre("Pop");
		a3.setLabel("Harvest");
		a3.setLength("43:13");
		a3.setImage(new Image("images/TheKickInside.png"));
		List<String> s3 = new ArrayList<String>();
		s3.add("Moving");
		s3.add("The Saxophone Song");
		s3.add("Strange Phenomena");
		s3.add("Kite");
		s3.add("The Man with the Child in His Eyes");
		a3.setSongs(s3);
		
		a4.setName("In the Court of the Crimson King");
		a4.setDescription("In the Court of the Crimson King (subtitled An Observation by King Crimson) is the debut album from the English rock band King Crimson, released on 10 October 1969 on Island Records in England and Atlantic Records in America. The album is one of the first and most influential of the progressive rock genre, where the band largely departed from the blues influences that rock music was founded upon and combined elements of jazz, classical, and symphonic music.");
		a4.setArtist("King Crimson");
		a4.setYear(1969);
		a4.setGenre("Progressive rock");
		a4.setLabel("Island and Atlantic");
		a4.setLength("43:56");
		a4.setImage(new Image("images/InTheCourtOfTheCrimsonKing.jpeg"));
		List<String> s4 = new ArrayList<String>();
		s4.add("21st Century Schizoid Man");
		s4.add("I Talk to the Wind");
		s4.add("Epitaph");
		s4.add("Moonchild");
		s4.add("The Court of the Crimson King");
		a4.setSongs(s4);
		
		a5.setName("Head Hunters");
		a5.setDescription("Head Hunters is the twelfth studio album by the American pianist and composer Herbie Hancock, released October 13, 1973, on Columbia Records. Recording sessions for the album took place in the evening at Wally Heider Studios and Different Fur Trading Co. in San Francisco, California. Head Hunters is a key release in Hancock's career and a defining moment in the genre of jazz.");
		a5.setArtist("Herbie Hancock");
		a5.setYear(1973);
		a5.setGenre("Fusion");
		a5.setLabel("Columbia");
		a5.setLength("41:52");
		a5.setImage(new Image("images/HeadHunters.jpg"));
		List<String> s5 = new ArrayList<String>();
		s5.add("Chameleon");
		s5.add("Watermelon Man");
		s5.add("Sly");
		s5.add("Vein Melter");
		a5.setSongs(s5);
		
		sample.add(a1);
		sample.add(a2);
		sample.add(a3);
		sample.add(a4);
		sample.add(a5);
		return sample;
	}
}
