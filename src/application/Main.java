package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Main extends Application {
	
	@Override
	public void start(Stage primaryStage) {
		try {
			// Instância o MainView no loader
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/gui/MainView.fxml"));
			// Carrega a MainView que estava no loader para um Parent
			Parent parent = loader.load();
			
			// Carrega o Parent como uma cena
			Scene mainScene = new Scene(parent);
			// Set o mainScene como um estagio
			primaryStage.setScene(mainScene);
			// Coloca um título no estagio
			primaryStage.setTitle("Sample JavaFX Application");
			// Mostra o estagio
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
