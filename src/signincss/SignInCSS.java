package signincss;

import com.sun.glass.events.MouseEvent;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * 了解如何使用CSS控制JavaFX畫面
 * @author USER
 *
 */
public class SignInCSS extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		GridPane grid = new GridPane();
		grid.setAlignment(Pos.CENTER);
		grid.setHgap(10);
		grid.setVgap(10);
		grid.setPadding(new Insets(25, 25, 25, 25));
		 
		Text scenetitle = new Text("Welcome");
		grid.add(scenetitle, 0, 0, 2, 1);
		Label userName = new Label("User Name");
		grid.add(userName, 0, 1);
		final TextField userTextField = new TextField();
		grid.add(userTextField, 1, 1);
		Label pw = new Label("Password");
		grid.add(pw, 0, 2);
		final PasswordField passwordField = new PasswordField();
		grid.add(passwordField, 1, 2);
		Button btn = new Button("Sign in");
		HBox hbBtn = new HBox(10);
		hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
		hbBtn.getChildren().add(btn);
		grid.add(hbBtn, 1, 4);
		final Text actiontarget = new Text();
		grid.add(actiontarget, 1, 6);
		
		// 設定按鈕事件
//		btn.setOnAction(new EventHandler<ActionEvent>() {
//		    @Override
//		    public void handle(ActionEvent e) {
//		        String userNameValue = userTextField.getText();
//		        String passwordValue = passwordField.getText();
//		        String result = "Incorrect!";
//		        if (userNameValue.equals("simon") && passwordValue.equals("javafx") ) {
//		            result = "Welcome!";
//		        }
//		        actiontarget.setFill(Color.FIREBRICK);
//		        actiontarget.setText(result);
//		    }
//		});
		
		// 設定按鈕事件的另一種寫法
		btn.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>(){
			@Override
			public void handle(ActionEvent event) {
				String userNameValue = userTextField.getText();
		        String passwordValue = passwordField.getText();
		        String result = "Incorrect!";
		        if (userNameValue.equals("simon") && passwordValue.equals("javafx") ) {
		            result = "Welcome!";
		        }
		        actiontarget.setFill(Color.FIREBRICK);
		        actiontarget.setText(result);
			}
		});
		
		
		// 指定CSS樣式
		// 指定標題CSS
		scenetitle.setId("welcome-text");
		// 指定error msg CSS
		actiontarget.setId("actiontarget");
		
		Scene scene = new Scene(grid, 300, 275);
		primaryStage.setScene(scene);
		// 指定CSS讀取背景圖片
		scene.getStylesheets().add(SignInCSS.class.getResource("SignIn.css").toExternalForm());
		primaryStage.show();
	}

}
