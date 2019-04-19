package controller;

import application.aaroncle_huntleym_MainApp;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import model.Album;

public class AlbumPageController {
	private aaroncle_huntleym_MainApp myGame; //reference to the main application
	
	private Stage prevStage;
	
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
	private ListView albumList;
	
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
	private ChoiceBox<Integer> ratingDropdown; 
	
	//song list
	@FXML
	private ListView songList;
	
	@FXML
	private Button saveBtn;
	
	@FXML
	private Button okBtn;
	
	@FXML
	private Button cancelBtn;
	
	/*
    @FXML
    private ComboBox<String> lightCB;
    */
    
    //this gets automatically called after the fields are injected
    public void initialize() {
    		//set values (Album)
    		//setValues(myGame.getCurrentAlbum());
    		
    		//set album list - TODO
    	
    		//add year values to dropdown
    		yearDropdown.getItems().addAll("1960", "1961", "1962", "1963", "1964", "1965", "1966", "1967", "1968", "1969",
    				"1970", "1971","1972","1973","1974","1975","1976","1977","1978","1979","1980","1981","1982","1983",
    				"1984","1985","1986","1987","1988","1989","1990","1991","1992","1993","1994","1995","1996","1997",
    				"1998","1999","2000","2001","2002","2003","2004","2005","2006","2007","2008","2009","2010","2011",
    				"2012","2013","2014","2015","2016","2017","2018","2019");
    		yearDropdown.setValue("1970");
    		
    		//add rating values to dropdown
    		ratingDropdown.getItems().addAll(1, 2, 3, 4, 5);
    		ratingDropdown.setValue(1);
        	
    		//song list - TODO
    		
    		//save button -- saves all the edits
    		saveBtn.setOnAction(ae ->{
    			
    		
    		});
    		
    		//ok button -- saves and closes so they can add another album
    		okBtn.setOnAction(ae -> {
    			
    		});
    		
    		//cancel button -- just closes
    		cancelBtn.setOnAction(ae -> {
    			
    		});
    }
    
    private void setValues(Album currentAlbum) {
    	//set album view
    	
    	
		//set name field
	
		//set description field
	
		//set artist field
	
		//set year released
    	
    		//set genre field
    	
		//set record label field
	
		//set length field
	
		//set rating 
    }
}
