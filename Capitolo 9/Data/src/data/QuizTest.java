/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.awt.Rectangle;

/**
 *
 * @author Federico
 */
public class QuizTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Measurable[] quiz = new Measurable[5];
        quiz[0] = new Quiz ("A+", 10);
        quiz[1] = new Quiz ("C", 6.5);
        quiz[2] = new Quiz ("E+", 4.5);
        quiz[3] = new Quiz ("B", 8);
        quiz[4] = new Quiz ("C-", 6);
        
        double average = Data.average(quiz);
        Measurable max = Data.max(quiz);
        Quiz app = (Quiz) max; 
        System.out.println("Average =" + average);
        System.out.println("Max vote =" + app.getVote() + " max point=" + app.getPoint());
        
        
        Measurable[] person = new Measurable[5];
        person[0] = new Person("Mario", 185);
        person[1] = new Person("Antonio", 192);
        person[2] = new Person("Federico", 189);
        person[3] = new Person("Giuseppe", 173);
        person[4] = new Person("Alvise", 163);
        
        System.out.println("Average= "+ Data.average(person));
        max = Data.max(person);
        Person p = (Person) max;
        System.out.println("Name: " + p.getName() + " height = " + p.getHeight());
        
    }
        
}
