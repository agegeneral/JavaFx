package helloJavaFx;

import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class HelloJavaFX extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// 建立按鈕元件
		Button btn = new Button();
		// 設定元件文字
		btn.setText("按鈕Hello world");
		// 事件綁定
		btn.setOnAction(new EventHandler() {
			@Override
			public void handle(Event event) {
				System.out.println("Hello~~~");
			}

		});
		
		// 建立面板元件
		StackPane root = new StackPane();
		// 面板加入btn節點
		root.getChildren().add(btn);
		
		// 使用Scene物件控制面板外觀
		Scene scene = new Scene(root, 800, 600);
		
		primaryStage.setTitle("Hello World!");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}

}
