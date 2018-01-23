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
public class FillInQuestion extends Question {
    
    private String text;
    private String answer;
    

   
    @Override
    public void setText(String aText){
        
        int a = aText.indexOf("_");
        text = aText.substring(0, a);
        text = String.format("%s__ ", text);
        super.setText(text);
    }
    
    @Override
    public void setAnswer(String question){
	int startUnder = question.indexOf('_')+1;
	answer = question.substring(startUnder,question.length()-1);
        super.setAnswer(answer);
    }
    
}
