package application;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.SceneBuilder;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Pong extends Application {
	private static final String VIEW_GAME = "GameView.fxml";
	private static final String STYLESHEET_FILE = "application.css";
	public static final Image ICON = new Image(
			Pong.class.getResourceAsStream("/image/square.png"));

	@Override
	public void start(final Stage stage) throws Exception {
		initGui(stage);
	}

	private void initGui(final Stage stage) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource(VIEW_GAME));
		Scene scene = SceneBuilder.create().root(root).width(500).height(530)
				.fill(Color.GRAY).build();
		scene.getStylesheets().add(STYLESHEET_FILE);
		stage.setScene(scene);
		stage.setTitle("Pong");
		stage.getIcons().add(ICON);
		stage.show();
	}

	public static void main(final String... args) {
		try {
			Application.launch(args);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}