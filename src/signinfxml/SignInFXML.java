package signinfxml;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * 利用FXML來刻畫面，把之前寫在java的畫面程式改寫在FXML檔
 * @author USER
 *
 */
public class SignInFXML extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
//		Parent root = FXMLLoader.load(getClass().getResource("SignIn.fxml"));
		
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(getClass().getResource("SignIn.fxml"));
		Parent root = loader.load();
		
		Scene scene = new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Sign In FXML");
		primaryStage.show();
	}

}
