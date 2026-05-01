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
			 //the movie scene
			MoviesScene movieScene = new MoviesScene();
			GridPane moviesView = movieScene.getView();
			
			//the tab and TabePane
			Tab genreTab = new Tab("Genres");
			Tab movieTab = new Tab("Movies");
			
			
			genreTab.setContent(genresView);
			movieTab.setContent(moviesView);
			
			TabPane tabPane = new TabPane();
			tabPane.getTabs().add(genreTab);
			tabPane.getTabs().add(movieTab);
			
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
