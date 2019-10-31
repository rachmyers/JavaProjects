/*
Developer: Rachel Myers
Date 10/5/19
Purpose: Main class and GUI for the magic eight ball app
*/

import javafx.animation.FadeTransition;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Sphere;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RaMyers
 */
public class MagicEightBall extends Application{
    
    PossibleAnswers getAnswer = new PossibleAnswers();

          
    @Override
    public void start(Stage primaryStage) {
        VBox root = new VBox(100);
        root.setAlignment(Pos.CENTER);
     
        StackPane ballPane = new StackPane();
        StackPane initialPane = new StackPane();
        StackPane windowPane = new StackPane();    
        
        Circle outline = new Circle(200, 200, 200);
        outline.setFill(Color.BLACK);
        
        
        Sphere window = new Sphere(85);
        windowPane.getChildren().add(window);
        initialPane.getChildren().add(new ImageView("images/eightBall.png"));     
        
        ballPane.getChildren().addAll(outline, windowPane, initialPane);
        
        Text directions = new Text("Ask a question, and then click \"Show Answer\"");
        directions.setFill(Color.BLACK);
        directions.setFont(Font.font ("Showcard Gothic", 24));
        
        Button btAnswer = new Button();
        btAnswer.setGraphic(new ImageView("images/showAnswer.png"));


btAnswer.setOnAction(new EventHandler<ActionEvent>() {
    @Override
    public void handle(ActionEvent event) {

        try{
            //Remove all existing children      
          initialPane.getChildren().clear();      
          windowPane.getChildren().add(new ImageView (getAnswer.returnAnswer()));
            
        } catch(Exception e)
        {
            initialPane.getChildren().clear();
            windowPane.getChildren().clear();
            windowPane.getChildren().add(new ImageView (getAnswer.returnAnswer()));
        }
        
    }
});
        
        root.getChildren().addAll(ballPane, directions, btAnswer);
        
        
        Scene scene = new Scene(root, 800, 800);
        Image applicationIcon = new Image(getClass().getResourceAsStream("images/icon.png"));
        primaryStage.getIcons().add(applicationIcon);  
        primaryStage.setTitle("Magic 8 Ball");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        launch(args);
    }
    

    
}
