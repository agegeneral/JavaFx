package helloJavaFx;


import javafx.application.Application;
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
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * 了解JavaFx基本元件
 * @author USER
 *
 */
public class SignIn extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// 設定root 原件
		GridPane grid = new GridPane();
		grid.setAlignment(Pos.CENTER);
		grid.setHgap(10);
		grid.setVgap(10);
		grid.setPadding(new Insets(25, 25, 25, 25));
		
		// 設定標題
		Text scenetitle = new Text("Welcome");
		// 設定字型
		scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
		// root加入title，位置在GridPane中第一欄與第一列，並指定它佔用兩個欄位與一列的空間
		grid.add(scenetitle, 0, 0, 2, 1);
		
		// 設定使用者標題
		Label userName = new Label("User Name");
		grid.add(userName, 0, 1);
		
		// 設定文字輸入框
		final TextField userTextField = new TextField();
		grid.add(userTextField, 1, 1);
		
		// 設定密碼標題
		Label pw = new Label("Password");
		grid.add(pw, 0, 2);
		
		// 設定密碼輸入框
		final PasswordField passwordField = new PasswordField();
		grid.add(passwordField, 1, 2);
		
		
		// 設定按鈕元件
		Button btn = new Button("Sign in");
		HBox hbBtn = new HBox(10);
		// 設定靠右
		hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
		// 用HBox容器包起來
		hbBtn.getChildren().add(btn);
		grid.add(hbBtn, 1, 4);
		
		// 設定用來顯示登入成功或失敗訊息的元件
		final Text actiontarget = new Text();
		grid.add(actiontarget, 1, 6);
		
		btn.setOnAction(new EventHandler() {
			@Override
			public void handle(Event event) {
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
		
		
		Scene scene = new Scene(grid, 300, 275);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}
