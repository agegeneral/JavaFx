package signinfxml;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;

public class SignInController implements Initializable {
	
	@FXML
	private TextField userTextField;
	@FXML
	private PasswordField passwordField;
	@FXML
	private Text actiontarget;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {

	}
	
	@FXML
	protected void handleSignInButtonAction(ActionEvent event) {
		String userNameValue = userTextField.getText();
	    String passwordValue = passwordField.getText();
	 
	    String result = "Incorrect!";
	 
	    if (userNameValue.equals("simon") && passwordValue.equals("javafx") ) {
	        result = "Welcome!";
	    }
	 
	    actiontarget.setFill(Color.FIREBRICK);
	    actiontarget.setText(result);
	}
}
