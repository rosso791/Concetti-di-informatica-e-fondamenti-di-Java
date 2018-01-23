/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question;

import java.util.Scanner;

/**
 *
 * @author Federico
 */
public class QuestionDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Question first = new Question();
        first.setText("Who was the inventor of Java?");
        first.setAnswer("James Gosling");  
        
        ChoiceQuestion second = new ChoiceQuestion();
        second.setText("In which country was the inventor of Java born?");
        second.addChoice("Australia", false);
        second.addChoice("Canada", true);
        second.addChoice("Denmark", false);
        second.addChoice("United States", false);
        
        NumericQuestion third = new NumericQuestion();
        third.setText("Sum this 2 number: A= 2.51  B=2.53");
        third.setAnswer(5.04);
        
        FillInQuestion fourth = new FillInQuestion();
        fourth.setText("Rome is in _Italy_");
        fourth.setAnswer("Rome is in _Italy_");
        
        AnyChoiceQuestion fifth = new AnyChoiceQuestion();
        fifth.setText("Which of this city are in Veneto?");
        fifth.addChoice("Venezia", true);
        fifth.addChoice("Rome", false);
        fifth.addChoice("Verona", true);
        fifth.addChoice("Milano", false);
        
        MultiChoiceQuestion sixth = new MultiChoiceQuestion();
        sixth.setText("Which of this city are in Lombardia?");
        sixth.addChoice("Milano", true);
        sixth.addChoice("Lecco", true);
        sixth.addChoice("Roma", false);
        sixth.addChoice("Venezia", false);
        
        ChoiceText seventh = new ChoiceText();
        seventh.setText("Which of this city is in Piemonte?");
        seventh.addChoice("Torino", true);
        seventh.addChoice("Milano", false);
        seventh.addChoice("Venezia", false);
        
        System.out.println(first.toString());
        System.out.println(second.toString());
        
        presentQuestion(first);
        presentQuestion(second);
        presentQuestion(third);
        presentQuestion(fourth);
        presentQuestion(fifth);
        presentQuestion(sixth);
        presentQuestion(seventh);
        
    }
    
    
    public static void presentQuestion(Question q){
        q.display();
        System.out.print("Your answer:");
        Scanner in = new Scanner(System.in);
        String response = in.nextLine();
        System.out.println(q.checkAnswer(response));
    }
}
