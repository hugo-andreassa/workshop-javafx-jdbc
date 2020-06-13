package gui.util;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class Alerts {
	
	public static void showAlert(String title, String header, String content, AlertType type) {
		// Instância o Alert passando o tipo
		Alert alert = new Alert(type);
		
		// Coloca o título do Alert
		alert.setTitle(title);
		// Coloca o cabeçalho do Alert
		alert.setHeaderText(header);
		// Coloca o conteúdo do Alert
		alert.setContentText(content);
		// Mostra o Alert
		alert.show();		
	}
}
