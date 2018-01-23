/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package investmentviewer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Federico
 */
public class InvestmentViewer {
    private static final int FRAME_WIDTH = 120;
    private static final int FRAME_HEIGHT = 60;
    
    private static final double INTEREST_RATE = 10;
    private static final double INITIAL_BALANCE = 1000;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        JFrame frame = new JFrame();
        JButton button = new JButton("Add interest");
        frame.add(button);
        
        final BankAccount account = new BankAccount(INITIAL_BALANCE);
        
        button.addActionListener((ActionEvent event) -> {
            double interest = account.getBalance() * INTEREST_RATE / 100;
                 account.deposit(interest);
                 System.out.println("balance: " + account.getBalance());
        });
        
        frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    
}
