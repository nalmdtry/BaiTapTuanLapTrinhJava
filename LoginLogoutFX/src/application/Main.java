package application;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	 @Override
	    public void start(Stage primaryStage) throws IOException {
	        // Tải file FXML định nghĩa giao diện
	        FXMLLoader loader = new FXMLLoader(getClass().getResource("Scene.fxml"));
	        Parent root = loader.load();

	        // Tạo Scene (bối cảnh) với giao diện đã tải
	        Scene scene = new Scene(root);

	        // Thiết lập Stage (cửa sổ chính)
	        primaryStage.setTitle("Ứng dụng Đăng nhập");
	        primaryStage.setScene(scene);
	        primaryStage.show();

	        
	         LoginController controller = loader.getController();
	    }

	
	public static void main(String[] args) {
		launch(args);
	}
}
