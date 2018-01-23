/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author Federico
 */
public class Quiz implements Measurable {
    
    public String vote;
    public double point;
    
    public Quiz (String avote, double apoint ){
        vote = avote;
        point = apoint;
    }
    
   
    
    @Override
    public double getMeasure(){
        return point;
    }
    
    public String getVote(){
        return vote;
    }
    
     public double getPoint(){
        return point;
    }
    
}
