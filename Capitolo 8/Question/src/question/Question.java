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
public class Question {
    private String text;
    private String answer;
    
    public Question(){
        text="";
        answer="";
    } 
    
    public void setText(String aText){
        text = aText;
    }
    
    public void setAnswer(String aAnswer){
        answer = aAnswer;
    }
    
    public String getAnswer(){
        return answer;
    }
    
    public void addText(String te){
        text += " " + te;
    }
    
    public boolean checkAnswer(String response){
        int i = 0 , j=0;
        response = response.toUpperCase();
        answer = answer.toUpperCase();
        while (i<response.length() && j<answer.length()){
            while (response.charAt(i) == ' '){
                i++;                
            }
            while (answer.charAt(j)==' '){
                j++;
            }
            if (answer.charAt(j)==(response.charAt(i))){
                i++;
                j++;
            }
            else{
                return false;
            }
        }
        return true;
    }
    
    public void display(){
        System.out.println(text);
    }
    
    @Override
    public String toString(){
        return "Question[text= " + text + " answer= " + answer + "]";
    }
}
