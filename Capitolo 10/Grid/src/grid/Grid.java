/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grid;

import java.util.ArrayList;

/**
 *
 * @author Federico
 */
public class Grid {
    
    private Location[][] grid;
    

    Grid(int rows, int columns) {
        grid= new Location[rows][columns];
    }
    
    public void add(int row, int column, String description){
        grid[row][column] = new Location (row,column,description);
    }
    
 

    ArrayList<Location> getDescribedLocations() {
      ArrayList<Location> res = new ArrayList<>();
        for (Location[] arr : grid){
            for (Location loc : arr){
                if (loc!= null){
                    res.add(loc);
                }
            }  
        }
        return res;
    }

    Object getDescription(int row, int column) {
        if(grid[row][column].getDescription() != null){
            return grid[row][column].getDescription();
        }
        else{
            return "Location empty";
        }
    }
    
    
    
    
    class Location{
        
        private String descr;
        private int rows;
        private int columns;
        
        public Location(int rows, int columns, String descr){
            this.columns = columns;
            this.rows = rows;
            this.descr = descr;
        }
        
        public String getDescription(){
            return descr;
        }
        
        
    
    }
}
