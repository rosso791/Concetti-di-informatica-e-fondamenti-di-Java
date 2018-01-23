/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numeberformatter;

/**
 *
 * @author Federico
 */
public class FormatterTest {

    /**
     * @param args the command line arguments
     */
    
    public static void display(NumberFormatter num, int[] arr){
        for (int i = 0; i<arr.length;i++){
            System.out.println(num.format(arr[i]));
        }
    }
    
    public static void main(String[] args) {
        
        NumberFormatter a = new DefaultFormatter();
        NumberFormatter b = new DecimalSeparatorFormatter();
        NumberFormatter c = new AccountingFormatter();
        NumberFormatter d = new BaseFormatter(2);
        int[] num =  new int[] {15233,6257,3,9,11,65,555};
        
        System.out.println("Default Formatter");
        display(a, num);
        System.out.println("Decimal separator formatter");
        display(b, num);
        System.out.println("Accounting formatter");
        display(c, num);
        System.out.println("Base formatter");
        display(d, num);
        System.out.println();
        
    }
    
}
