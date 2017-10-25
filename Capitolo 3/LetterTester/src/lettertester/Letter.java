/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lettertester;

/**
 *
 * @author Federico
 */
public class Letter {
    
    private String inizio ; 
    
    private String fine;
    
    public Letter (String from, String to){
        inizio = "Dear".concat(from).concat(":").concat("\n");
        fine = "Sincerely,".concat("\n").concat(to);
    }
    
    public void addLine (String line){
        inizio = inizio.concat(line).concat("\n");
    }
    
    public String getText(){
        return inizio.concat(fine);
    }
    
    
    
}
