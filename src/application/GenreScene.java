package application;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class GenreScene {
	//styles
	 private final String BTN_PRIMARY = 
		        "-fx-background-color: #2196F3;" +
		        "-fx-text-fill: white;" +
		        "-fx-background-radius: 5;";

		    private final String BTN_DANGER = 
		        "-fx-background-color: #e53935;" +
		        "-fx-text-fill: white;" +
		        "-fx-background-radius: 5;";
	Label text1 = new Label("Name:"); 
	Label text2 = new Label("Registered:");
	TextField textfield1 = new TextField();//for the name
	ComboBox comboBox = new ComboBox();// for the registered
	 //buttons
	Button button1 = new Button("Save");
	Button button2 = new Button("Remove");
	
	//gridPane
	GridPane gridPane = new GridPane();
	
	
public GridPane getView() {
	  gridPane.setMinSize(600, 400);
      gridPane.setPadding(new Insets(10, 10, 10, 10));
      gridPane.setVgap(10);
      gridPane.setHgap(10);
      gridPane.setAlignment(Pos.CENTER);

      // add your nodes to the grid
      gridPane.add(text1, 0, 0);
      gridPane.add(textfield1, 1, 0);
      gridPane.add(button1, 1, 1);
      gridPane.add(text2, 0, 2);
      gridPane.add(comboBox, 1, 2);
      gridPane.add(button2, 1, 3);
      
      //customizing the nodes
      button1.setStyle(BTN_PRIMARY);
      button2.setStyle(BTN_DANGER);
      comboBox.setStyle(BTN_PRIMARY);
      
   // 
      textfield1.setStyle(
          "-fx-background-color: #f5f5f5;" +
          "-fx-border-color: #2196F3;" +      
          "-fx-border-width: 0 0 2 0;" +       
          "-fx-border-radius: 3;" +
          "-fx-background-radius: 3;" +
          "-fx-padding: 8;" +
          "-fx-font-size: 13px;"
      );
      
      gridPane.setStyle(
    		    "-fx-background-color: white;" +
    		    "-fx-border-color: #444466;" +
    		    "-fx-border-width: 1;" +
    		    "-fx-border-radius: 8;"
    		);
      text1.setStyle(
    		    "-fx-font-size: 15px;" +
    		    "-fx-font-weight: bold;" +
    		    "-fx-text-fill: #333333;"            
    		);
      text2.setStyle(
    		    "-fx-font-size: 15px;" +
    		    "-fx-font-weight: bold;" +
    		    "-fx-text-fill: #333333;"            
    		);

    
      
	return gridPane;
}
	
	
	
	
}


