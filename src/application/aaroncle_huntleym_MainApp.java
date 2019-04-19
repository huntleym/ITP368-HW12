package application;
	
import java.io.IOException;

import controller.AlbumPageController;
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import model.Album;
import model.AlbumList;


public class aaroncle_huntleym_MainApp extends Application {
	
	private ListView<Album> list;
	
	private Album currentAlbum;
	
	@Override
	public void start(Stage primaryStage) {
		list = new ListView<>();
		setUpListView();
		list.setPrefWidth(300);
		list.setPrefHeight(300);
		
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(getClass().getResource("/view/AlbumPage.fxml"));
			
			BorderPane root = (BorderPane)loader.load();
			
			if (loader.getController() == null) {
				System.out.println("controller null");
			}
			
			AlbumPageController apc = loader.getController();
			apc.setMainApp(this);
			apc.setPrevStage(primaryStage);
			
			//Pane mainPane = new Pane();
			//root.getChildren().add(list);

			Scene scene = new Scene(root); //800,600
			//scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
	public Album getCurrentAlbum() {
		return currentAlbum;
	}
	
	private void setUpCenterPane() {
		
	}
	
	private void setUpListView() {
		ObservableList<Album> albumList = AlbumList.getSample();
		list.getItems().addAll(albumList);
		list.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
		
		list.getSelectionModel().selectedItemProperty().addListener((obValue, oldVal, newVal)-> {
			System.out.println("Selected: " + newVal.getName());
			// TODO: Make values on right change when clicked by:
			// Calling method to change information that takes in in newVal as the Album to base info off of
		});
		list.getSelectionModel().selectFirst();
		list.setCellFactory(l -> new AlbumCell());
	}
	
	private class AlbumCell extends ListCell<Album> {
		private HBox row;
		private VBox label;
		private ImageView art;
		private Label title;
		private Label artist;
		
		public AlbumCell() {
			row = new HBox(10);
			label = new VBox();
			art = new ImageView();
			title = new Label();
			title.setStyle("-fx-font-size: 20; -fx-font-weight: bold;");
			artist = new Label();
			artist.setStyle("-fx-font-size: 14; -fx-font-style: italic;");
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
			
			//USE THIS FOR IMAGE ACCESSIBILITY ON CENTER PANE
			//art.setAccessibleText("Image of the album art for " + p.getName() + " by " + p.getArtist());
			//art.setFocusTraversable(true);
			
			title.setText(p.getName());
			artist.setText("by " + p.getArtist());
			
		}
		private void shrinkImage(ImageView i) {
			i.setFitWidth(50);
			i.setPreserveRatio(true);
			
		}
	}
}
