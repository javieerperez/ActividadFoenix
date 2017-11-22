package application;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;


public class MainLoginUem extends Application {
	
	Stage stage;
	
    @Override
    public void start(Stage stage) throws Exception {
    	this.stage=stage;
    	mainWindow();
    }
    public void mainWindow(){
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("VentanaLogin.fxml"));
	        AnchorPane mypane;
			mypane = loader.load();
        stage.setTitle("Blackboard");
        Scene scene = new Scene(mypane);
        stage.setScene(scene);
        stage.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    public static void main(String[] args) {
        launch(args);
    }
    
}