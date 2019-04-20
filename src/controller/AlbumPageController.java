package controller;


import java.util.Locale;
import java.util.ResourceBundle;
import java.util.stream.Collectors;

import application.aaroncle_huntleym_MainApp;
//import application.aaroncle_huntleym_MainApp.AlbumCell;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import model.Album;
import model.AlbumList;

public class AlbumPageController {
	private aaroncle_huntleym_MainApp myGame; //reference to the main application
	private ListView<Album> list;
	
	private Stage prevStage;
	
	private Album currentAlbum;
	//private ObservableList<Album> allAlbums;
	
	public AlbumPageController() {
		
	}
	
	public void setMainApp(aaroncle_huntleym_MainApp main) {
		myGame = main;
	}
	
	public void setPrevStage(Stage stage) {
		prevStage = stage;
	}

	//list of albums
	@FXML
	private ListView<Album> albumList;
	
	//image view
	@FXML
	private ImageView albumImg;
	
	//name field
	@FXML
	private TextField nameField;
	
	//description field
	@FXML
	private TextArea descriptionField;
	
	//artist field
	@FXML
	private TextField artistField;
	
	//year released dropdown list
	@FXML
	private ChoiceBox<String> yearDropdown;
	
	//genre field
	@FXML
	private TextField genreField;
	
	//record label field
	@FXML
	private TextField recordField;
	
	//length field
	@FXML
	private TextField lengthField;
	
	//rating field
	@FXML
	private ChoiceBox<String> ratingDropdown; 
	
	//song list
	@FXML
	private ListView<String> songList;
	
	@FXML
	private Button saveBtn;
	
	private Album currAlbum;
	ObservableList<Album> allAlbums;
	
	@FXML
	private Label headerLabel;
	
	@FXML
	private Label chooseLabel;
	
	@FXML
	private Label nameLabel;
	
	@FXML
	private Label descriptionLabel;
	
	@FXML
	private Label artistLabel;
	
	@FXML
	private Label genreLabel;
	
	@FXML
	private Label recordLabel;
	
	@FXML
	private Label lengthLabel;
	
	@FXML
	private Label ratingLabel;
	
	@FXML
	private Label songsLabel;
	
	@FXML
	private Label yearReleased;
    
    //this gets automatically called after the fields are injected
    public void initialize() {
    		
    		
    		ResourceBundle me = ResourceBundle.getBundle("bundles.labels", Locale.getDefault());
    		
    		System.out.println(me.getString("header"));
    		System.out.println(me.getString("name"));
    		System.out.println(me.getString("artist"));
    		
    		//set values for labels based on locale
    		if (headerLabel == null) {
    			System.out.println("Header label null");
    		}
    		
    		headerLabel.setText(me.getString("header"));
    		nameLabel.setText(me.getString("name"));
    		descriptionLabel.setText(me.getString("description"));
    		artistLabel.setText(me.getString("artist"));
    		yearReleased.setText(me.getString("year"));
    		genreLabel.setText(me.getString("genre"));
    		recordLabel.setText(me.getString("record"));
    		lengthLabel.setText(me.getString("length"));
    		ratingLabel.setText(me.getString("rating"));
    		songsLabel.setText(me.getString("tracks"));
    		chooseLabel.setText(me.getString("choose"));
    		saveBtn.setText(me.getString("save"));
    	
    		
    		if (myGame == null) {
    			System.out.print("main is null");
    		}
    		
    		//allow descriptions to wrap
    		descriptionField.setWrapText(true);
    	
    		//add year values to dropdown
    		yearDropdown.getItems().addAll("1960", "1961", "1962", "1963", "1964", "1965", "1966", "1967", "1968", "1969",
    				"1970", "1971","1972","1973","1974","1975","1976","1977","1978","1979","1980","1981","1982","1983",
    				"1984","1985","1986","1987","1988","1989","1990","1991","1992","1993","1994","1995","1996","1997",
    				"1998","1999","2000","2001","2002","2003","2004","2005","2006","2007","2008","2009","2010","2011",
    				"2012","2013","2014","2015","2016","2017","2018","2019");
    		yearDropdown.setValue("1970");
    		
    		//add rating values to dropdown

    		ratingDropdown.getItems().addAll("1", "2", "3", "4", "5");
    		//ratingDropdown.setValue(1);

    		ratingDropdown.setValue(null);

    		allAlbums = AlbumList.getSample();
    		
    		//save button -- saves all the edits
    		saveBtn.setOnAction(ae ->{
    			saveEdits();
    		});
    }
    
    private void saveEdits() {

    		//grab values of everything and save it
    		//set name field
      /*
		String nameText = nameField.getText();
		System.out.println(nameText);

		//set description field
		String descriptionText = descriptionField.getText();
		System.out.println(descriptionText);

		//set artist field
		String artistText = artistField.getText();
		System.out.println(artistText);

		//set year released
		String yearText = yearDropdown.getValue();
		System.out.println(yearText);
	
		//set genre field
		String genreText = genreField.getText();
		System.out.println(genreText);
	
		//set record label field
		String recordText = recordField.getText();
		System.out.println(recordText);

		//set length field
		String lengthText = lengthField.getText();
		System.out.println(lengthText);

		//set rating 
		String rating = ratingDropdown.getValue();
		System.out.println(rating);
		
		//add to the album list
		for (Album a : allAlbums) {
			if (a == currentAlbum) {
				a.setName(nameText);
				a.setDescription(descriptionText);
				a.setArtist(artistText);
				a.setYear(Integer.parseInt(yearText));
				a.setGenre(genreText);
				a.setLabel(recordText);
				a.setLength(lengthText);
				a.setRating(Integer.parseInt(rating));
				break;
			}
		}
    */

    	//update name
    	currAlbum.setName(nameField.getText());

		//update description
    	currAlbum.setDescription(descriptionField.getText());

		//update artist
    	currAlbum.setArtist(artistField.getText());

		//update year released
    	currAlbum.setYear(Integer.parseInt(yearDropdown.getValue()));
	
		//update genre
    	currAlbum.setGenre(genreField.getText());
	
		//update record label
    	currAlbum.setLabel(recordField.getText());
    	
    	//update length
    	currAlbum.setLength(lengthField.getText());

		//update rating 
		if (ratingDropdown.getValue() != null) currAlbum.setRating(Integer.parseInt(ratingDropdown.getValue()));
		
		setAlbumList(albumList);

    }
    
    private void closeView() {
    	
    }
    
    public void setValues() {
		//set album image
		albumImg.setImage(currAlbum.getImage());
		albumImg.setAccessibleText("Image of the album art for " + currAlbum.getName() + " by " + currAlbum.getArtist());
		albumImg.setFocusTraversable(true);
	
		//set name field
		nameField.setText(currAlbum.getName());

		//set description field
		descriptionField.setText(currAlbum.getDescription());

		//set artist field
		artistField.setText(currAlbum.getArtist());

		//set year released
		yearDropdown.setValue(Integer.toString(currAlbum.getYear()));
	
		//set genre field
		genreField.setText(currAlbum.getGenre());
	
		//set record label field
		recordField.setText(currAlbum.getLabel());

		//set length field
		lengthField.setText(currAlbum.getLength());

		//set rating 

		//ratingDropdown.setValue(Integer.toString(currentAlbum.getRating()));

		if (currAlbum.getRating() == 0) ratingDropdown.setValue(null);
		else ratingDropdown.setValue(Integer.toString(currAlbum.getRating()));

	
		//song list - TODO
		songList.setItems(FXCollections.observableList(currAlbum.getSongs()));
    }
    
    public void setAlbumList(ListView<Album> albums) {
    		//albumList.setItems(albums.getItems());
    		

    		//allAlbums = AlbumList.getSample();

    		albumList.getItems().clear();

    		albumList.getItems().addAll(allAlbums);
    		albumList.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
    		
    		albumList.getSelectionModel().selectedItemProperty().addListener((obValue, oldVal, newVal)-> {

    			
    			//this.currentAlbum = newVal;
    			//this.setValues(newVal);

    			if (newVal != null) {
    				System.out.println("Selected: " + newVal.getName());
	    			currAlbum = newVal;
	    			setValues();
    			}

    		});
    		albumList.setEditable(true);
    		albumList.getSelectionModel().selectFirst();
    		albumList.setCellFactory(l -> new AlbumCell());
    }
    
    private class AlbumCell extends ListCell<Album> {
		private HBox row;
		private VBox label;
		private ImageView art;
		private Label title;
		private Label artist;
		
		public AlbumCell() {
			this.setEditable(true);
			row = new HBox(10);
			label = new VBox();
			art = new ImageView();
			title = new Label();
			title.setStyle("-fx-font-size: 15; -fx-font-weight: bold;");
			artist = new Label();
			artist.setStyle("-fx-font-size: 10; -fx-font-style: italic;");
			row.getChildren().addAll(art,label);
			label.getChildren().addAll(title, artist);
		}
		@Override
		public void updateItem(Album p, boolean empty) {
			super.updateItem(p, empty);
			if(empty) {
				setText(null);
	            setGraphic(null);
			}
			else {
				makeRow(p);
				setGraphic(row);
			}
		}
		
		private void makeRow(Album p) {
			art.setImage(p.getImage());
			shrinkImage(art);
			
			title.setText(p.getName());
			artist.setText("by " + p.getArtist());
			
		}
		private void shrinkImage(ImageView i) {
			i.setFitWidth(30);
			i.setPreserveRatio(true);
			
		}
	}
}
