/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numeric;

/**
 *
 * @author Federico
 */
public class Numeric {
    public static double intPower(double x, int n){
        if (n<0){
            return 1/(Math.pow(x, -n));
        }
        else{
            if (n%2==0){
                return Math.pow(Math.pow(x, n/2), 2);
            }
            else{
                return Math.pow(x,n-1)*x;
            }
        }
    }
}
