/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labeledtwobuttons;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 *
 * @author Federico
 */
public class ClickListner implements ActionListener {
    public int count;
    private String label;
    
    public ClickListner(String label){
        count = 0;
        this.label = label;
    }
    
    public void actionPerformed(ActionEvent event){
        count++;
        System.out.println("Button " + this.label + " was clicked " + count + "times");
    }
}
