/**
 * program: Convert US dollars into Canadian dollars
 * developer: Rachel Myers
 * date:    3/8/19
 * purpose: create a GUI program that converts an amount that users enter from US dollars to Canadian dollars.
 */


import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.geometry.HPos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class ConvertDollars extends Application {
    
    //Create text fields and Convert button
    private TextField tfUSDollars = new TextField();
    private TextField tfCanadianDollars = new TextField();
    private Button btConvert = new Button("Convert");
    
    @Override
    public void start(Stage primaryStage) {
        
        //create GridPane and add labels, textfields, and button to pane
        GridPane pane = new GridPane();
        pane.setHgap(5);
        pane.setVgap(5);
        pane.add(new Label("U.S. Dollars"), 0, 0);
        pane.add(tfUSDollars, 1, 0);
        pane.add(new Label("Canadian Dollars"), 0, 1);
        pane.add(tfCanadianDollars, 1, 1);
        pane.add(btConvert, 1, 2);
        
        //set properties
        pane.setAlignment(Pos.CENTER);
        tfUSDollars.setAlignment(Pos.BOTTOM_RIGHT);
        tfCanadianDollars.setAlignment(Pos.BOTTOM_RIGHT);
        tfCanadianDollars.setEditable(false);
        GridPane.setHalignment(btConvert, HPos.RIGHT);
              
        
        //create scene and place in stage
        Scene scene = new Scene(pane, 275, 100);
        primaryStage.setTitle("Convert U.S. Dollars to Canadian Dollars");
        primaryStage.setScene(scene);
        primaryStage.show();
     
      //create handler for Convert button
        btConvert.setOnAction(e -> convertDollars());  
      
      //allow users option to press Enter to convert instead of having to clicking button
      scene.setOnKeyPressed(e -> {
      if (e.getCode() == KeyCode.ENTER) {
        convertDollars();
      }
        });
    }

    private void convertDollars() {
       
        //get text value from US Dollars field and set up calculation
        double USDollars = Double.parseDouble(tfUSDollars.getText());
        double canadianDollars = 1.5 * USDollars;
        
        //display result in Canadian Dollars field
        tfCanadianDollars.setText(String.format("$%.2f",
      canadianDollars));
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
