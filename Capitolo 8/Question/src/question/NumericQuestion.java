/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question;

/**
 *
 * @author Federico
 */
public class NumericQuestion extends Question{
    private double tolerance;
    private double answer;
    public NumericQuestion(){
        tolerance = 0.01;
    }
    
    public void setAnswer(double aAnswer){
        answer = aAnswer;
    }
    
    public boolean checkAnswer(String response){
        return Math.abs(Double.parseDouble(response) - answer) <= tolerance;
    }
    

}
