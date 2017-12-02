package application;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;


public class MainLoginUem extends Application {
	
	Stage stage;
	FXMLLoader loader1, loader2;
	Scene scene1, scene2;
	
    @Override
    public void start(Stage primaryStage) throws Exception {
    	stage=primaryStage;
    	loader1 = new FXMLLoader(getClass().getResource("VentanaLogin.fxml"));
    	loader2 = new FXMLLoader(getClass().getResource("inicioUEM.fxml"));
    	mainWindow();
    }
    public void mainWindow(){
		try {
	    AnchorPane mypane1 = loader1.load();
	    scene1 = new Scene(mypane1);
	    
	    AnchorPane mypane2 = loader2.load();
		scene2 = new Scene(mypane2);
		
		Controller controller1 = loader1.getController();
		controller1.inicio(stage, scene2);
	    
	    
        stage.setTitle("Blackboard");
        stage.setScene(scene1);
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