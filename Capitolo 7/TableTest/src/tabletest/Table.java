/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tabletest;

/**
 *
 * @author Federico
 */
public class Table {
    private int[][] values;
    public Table(int rows, int columns){
        values = new int [rows][columns];
    }
    
    public void set (int i, int j, int n){
        values[i][j] = n;
    }
    
    public boolean presente (int i, int j){
        if (i < 0 || j < 0 || i==values.length || j == values[0].length ){
            return false;
        }
        else{
            return true;
        }
    }
    
    public double neighbourAverage(int row, int column){
        double total = - values[row][column];
        for (int i  =row-1; i <= row+1; i++){
            for (int j =  column-1; j<=column+1; j++){
                if (presente (i,j) == true){
                    total+= values[i][j];
                }
            }
        }
        return total/8;
    }
    
    public double sum (int i, boolean horizontal){
        double sum = 0;
        if (horizontal == true){
            for (int j=0 ; j< values[0].length; j++){
                sum+=values[i][j];
            }
        }
        else{
            for (int[] value : values) {
                sum += value[i];
            }
        }
        return sum;
    }
}
