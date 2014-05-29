package application;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

public class GreenhouseApp extends Application {

	private GreenhouseController controller;

	@Override
	public void start(Stage stage) {
		try {
			FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(
					"Sample.fxml"));

			GridPane root = (GridPane) fxmlLoader.load();
			Scene scene = new Scene(root);
			scene.getStylesheets().add(
					getClass().getResource("application.css").toExternalForm());
			controller = (GreenhouseController) fxmlLoader.getController();
			stage.setScene(scene);
			stage.setResizable(false);
			stage.getIcons().add(
					new Image(GreenhouseApp.class
							.getResourceAsStream("raptor.png")));
			stage.setTitle("Greenhouse Control by Raptor");
			stage.setOnCloseRequest(new EventHandler<WindowEvent>() {
		          public void handle(WindowEvent we) {
		              System.out.println("Stage is closing");
		              controller.close();
		          }
		      });     
			stage.show();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Override
    public void stop() throws Exception {
        super.stop();

    }
	
	public static void main(String[] args) {
		launch(args);
	}
}
