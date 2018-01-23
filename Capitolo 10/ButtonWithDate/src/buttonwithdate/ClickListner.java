/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buttonwithdate;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;


/**
 *
 * @author Federico
 */
public class ClickListner implements ActionListener {
    public int count = 0;
    
    public void actionPerformed(ActionEvent event){
        String time = new Date().toString();
        count++;
        System.out.println("I was clicked" + count +" times, "+ "at time " + time);
    }
}
