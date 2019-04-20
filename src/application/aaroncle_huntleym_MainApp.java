package application;
	
import java.io.IOException;
import java.util.Locale;

import controller.AlbumPageController;
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import model.Album;


public class aaroncle_huntleym_MainApp extends Application {
	
	private AlbumPageController controller;
	private ListView<Album> list;
	private Album currentAlbum;
	
	private ObservableList<Album> albumList;
	
	@Override
	public void start(Stage primaryStage) {

		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(getClass().getResource("/view/AlbumPage.fxml"));
			
			BorderPane root = (BorderPane)loader.load();
			
			if (loader.getController() == null) {
				System.out.println("controller null");
			}
			
			controller = loader.getController();
			controller.setMainApp(this);
			controller.setPrevStage(primaryStage);
			
			list = new ListView<>();
			list.setPrefWidth(300);
			list.setPrefHeight(300);
			list.setEditable(true);
			
			controller.setAlbumList(list);
			

			Scene scene = new Scene(root);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
