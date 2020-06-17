package gui.util;

import java.util.Optional;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;

public class Alerts {
	
	public static void showAlert(String title, String header, String content, AlertType type) {
		// Inst�ncia o Alert passando o tipo
		Alert alert = new Alert(type);
		
		// Coloca o t�tulo do Alert
		alert.setTitle(title);
		// Coloca o cabe�alho do Alert
		alert.setHeaderText(header);
		// Coloca o conte�do do Alert
		alert.setContentText(content);
		// Mostra o Alert
		alert.show();		
	}
	
	public static Optional<ButtonType> showConfirmation(String title, String content) {
		Alert alert = new Alert(AlertType.CONFIRMATION);
		
		alert.setTitle(title);
		alert.setHeaderText(null);
		alert.setContentText(content);
		
		return alert.showAndWait();
	}
}
