package application;

import java.net.URL;
import java.util.ResourceBundle;


import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;


public class Controller implements Initializable{
	
	Stage stage;
	Scene inicioUEM;
	
	@FXML
    private MediaView mediaView;
	
	
	@Override
    public void initialize(URL location, ResourceBundle resources) {
    	 Media media2= new Media(getClass().getResource("media/video_UEM.mp4").toExternalForm());
         MediaPlayer player=new MediaPlayer(media2);
         mediaView.setMediaPlayer(player);
         player.play();
    }
	
	@FXML
	public void cambiarEscena() throws Exception {
		stage.setScene(inicioUEM);
	}

	public void inicio(Stage stage2, Scene scene2) {
		this.inicioUEM= scene2;
		this.stage=stage2;	
	}
	
	
}