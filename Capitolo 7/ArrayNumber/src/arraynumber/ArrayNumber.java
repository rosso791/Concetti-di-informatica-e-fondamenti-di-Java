/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraynumber;
import java.util.Random;
/**
 *
 * @author Federico
 */
public class ArrayNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] array = new int[10];
        Random r = new Random();
        int i;
        for (i =0; i<10;i++ ){
            array[i]= r.nextInt(10); 
        }
        System.out.print("Numeri con indice pari :" );
        for (i=0; i<10; i++){
            if (i%2==0){
               System.out.print(array[i] + " ");
            }
        }
        System.out.println("Numeri con valore pari:");
        for (i=0; i<10; i++){
            if (array[i]%2==0){
               System.out.print(array[i] + " ");
            }
        }
        System.out.println("Array inverso:");
        for (i=9; i>=0; i--){
               System.out.print(array[i]+ " ");
        }
        System.out.println("Primo:"+ array[0] );
        System.out.println("Ultimo:"+ array[9] );
    }
    
}
