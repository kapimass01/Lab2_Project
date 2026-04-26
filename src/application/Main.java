package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.GridPane;



public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			//creating the genre scene
			GenreScene genreScene = new GenreScene();
			GridPane genresView =genreScene.getView();
			
			//the tab and TabePane
			Tab genreTab = new Tab("Genres");
			genreTab.setContent(genresView);
			
			TabPane tabPane = new TabPane();
			tabPane.getTabs().add(genreTab);
			
			Scene scene = new Scene(tabPane);
			primaryStage.setTitle("Movie Library System");
			primaryStage.setScene(scene);
			primaryStage.show();
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
