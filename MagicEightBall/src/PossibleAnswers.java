
import java.util.ArrayList;
import javafx.scene.image.Image;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RaMyers
 */
public class PossibleAnswers {
    ArrayList<Image> answerList = new ArrayList<Image>();
    

        
    
    
    public Image returnAnswer() {
        for(int i = 0; i < 20; i++) {
        answerList.add(new Image ("images/" + i + ".png"));
        
    }
        int randomNum = (int) (Math.random() * 20);
        return answerList.get(randomNum);
    

    }
}
