package gui;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuItem;

public class MainViewController implements Initializable {

	@FXML
	private MenuItem menuItemSeller;
	@FXML
	private MenuItem menuItemDepartment;	
	@FXML
	private MenuItem menuItemAbout;
	
	// Esse m�todo vem da Interface Initializable e serve 
	// para executar coisas ao carregar a p�gina
	@Override
	public void initialize(URL url, ResourceBundle rb) {
		
	}
	
	// M�todos das A��es ---------------------
	@FXML
	public void onMenuItemSellerAction() {
		System.out.println("onMenuItemSellerAction");
	}
	
	@FXML
	public void onMenuItemDepartmentAction() {
		System.out.println("onMenuItemDepartmentAction");
	}
	
	@FXML
	public void onMenuItemAboutAction() {
		System.out.println("onMenuItemAboutAction");
	}
	
}
