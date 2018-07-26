/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 *
 * @author Yakir
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    
    @FXML
    private Label display;
    
    private String str = "";
    private String operator = "";
    private String num1 = "";
    private String num2 = "";
    private String num2Text = "";
    
    Calculator calc = new Calculator();
    
    @FXML
    public void processNumbers(ActionEvent event){
        if(operator.equals("=")){
            display.setText("");
            num1 = "";
            num2 = "";
            operator = "";
        }
        if(operator.isEmpty()){
            num1 += ((Button)event.getSource()).getText();
            display.setText(num1);
        }
        else {
            num2Text = ((Button)event.getSource()).getText();
            num2 += ((Button)event.getSource()).getText();
            display.setText(display.getText()+num2Text);        
         }
    }
    
    @FXML
    public void processOperators(ActionEvent event){
        
        if(!((Button)event.getSource()).getText().equals("=")){
            operator = ((Button)event.getSource()).getText();
            display.setText(display.getText()+operator);
        }else{            
            display.setText(""+calc.calculate(Long.parseLong(num1),Long.parseLong(num2),operator));
            operator = "=";
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
