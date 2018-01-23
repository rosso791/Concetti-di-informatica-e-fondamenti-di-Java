/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question;

import java.util.ArrayList;

/**
 *
 * @author Federico
 */
public class AnyChoiceQuestion extends Question{
    
    private ArrayList<String> choices;
    private String choiceString;
    
            
    public AnyChoiceQuestion(){
        choices = new ArrayList<String>();
        choiceString="";
    }
    
    public void setText (String text){
        super.setText(text+ "(the question is correct if you give one the correct answer)");
    }
    
    public void addChoice(String response, boolean correct ){
        choices.add(response);
        if(correct){
            String pos = "" + choices.size();
            choiceString = choiceString + " " + pos; 
            setAnswer(choiceString);
        }
    }
    
    
    
    public boolean checkAnswer (String response){
        return super.getAnswer().contains(response.trim());
    }
    
    public void display(){
        super.display();
        for (int i=0; i<choices.size();i++){
            System.out.println((i+1)+": "+choices.get(i));
        }
    }
    
}
