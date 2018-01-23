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
public class MultiChoiceQuestion extends Question{
    
    private ArrayList<String> choices;
    private String choiceString;

    
    public MultiChoiceQuestion(){
        choices = new ArrayList<String>();
        choiceString="";
    }
    
    @Override
    public void setText(String s){
        super.setText(s+ "(the question is correct if you give all the correct answer)");
    }
    
    public void addChoice(String response, boolean correct ){
        choices.add(response);
        if(correct){
            String pos = "" + choices.size();
            choiceString = choiceString + " " + pos; 
            setAnswer(choiceString);
        }
    }
    
    
    
    @Override
    public void display(){
        super.display();
        for (int i=0; i<choices.size();i++){
            System.out.println((i+1)+": "+choices.get(i));
        }
    }
}
