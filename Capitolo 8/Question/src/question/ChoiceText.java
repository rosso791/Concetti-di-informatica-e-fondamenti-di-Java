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
public class ChoiceText extends Question {
    
   private String choice;
   int count;
   
   public ChoiceText (){
       choice = "";
       count = 0;
   }
   
   public void addChoice (String answer, boolean correct){
       count++;
       addText(Integer.toString(count) + answer + " ");
       if (correct){
           setAnswer(Integer.toString(count));
       }
       
       
   }
   
   
    
}
