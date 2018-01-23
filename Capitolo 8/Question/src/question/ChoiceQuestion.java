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
public class ChoiceQuestion extends Question {
    private ArrayList<String> choices;
    
    public ChoiceQuestion(){
        choices = new ArrayList<String>();
    }
    
    public void addChoice (String choice, boolean correct){
        choices.add(choice);
        if(correct){
            String choiceString = "" + choices.size();
            setAnswer(choiceString);
        }
    }
    
    public void display(){
        super.display();
        for(int i=0; i<choices.size(); i++){
            int choiceNumber=i+1;
            System.out.println(choiceNumber+ ": " + choices.get(i));
        }
                
    }
    
    public String toString(){
        return "ChoiceQuestion [super= " + super.toString() + "[choice = " + choices.toString() +"]" ;
    }
}
