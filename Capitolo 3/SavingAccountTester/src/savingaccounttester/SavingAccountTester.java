/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package savingaccounttester;

/**
 *
 * @author Federico
 */
public class SavingAccountTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SavingAccount mio = new SavingAccount (1000, 10);
        mio.addInterst();
        mio.addInterst();
        mio.addInterst();
        mio.addInterst();
        mio.addInterst();
        System.out.println(mio.getBalance());
    }
    
}
