package model;

import java.util.ArrayList;
import java.util.List;

import javafx.scene.image.Image;

public class Album {
	private String name;
	private String description;
	private String artist;
	private int year;
	private String genre;
	private String label;
	private String length;
	private int rating;
	private Image image;
	private List<String> songs;
	
	public Album() {
		setSongs(new ArrayList<String>());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getLength() {
		return length;
	}

	public void setLength(String length) {
		this.length = length;
	}

	public List<String> getSongs() {
		return songs;
	}

	public void setSongs(List<String> songs) {
		this.songs = songs;
	}

	public Image getImage() {
		return image;
	}

	public void setImage(Image image) {
		this.image = image;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}
}
