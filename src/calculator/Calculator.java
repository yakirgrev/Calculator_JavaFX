/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Yakir
 */
public class Calculator extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
    public float calculate(long number1,long number2,String operator){
        switch(operator){
            case "+":
                return number1+number2;
            case "-":
                return number1-number2;
            case "/":
                if(number2==0)
                    return 0;
                    return number1/number2;
            case "*":
                return number1*number2;
                
            default: return 0;
                    
        }
        
    }
    
}
