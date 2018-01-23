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
public class GridTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int gridRows = 3;
        int gridColumns = 3;

        Grid grid = new Grid(gridRows, gridColumns);

        grid.add(0, 0, "");
        grid.add(1, 1, "player 1");
        grid.add(2, 2, "player 2");

        ArrayList<Grid.Location> locations = grid.getDescribedLocations();

        for (Grid.Location l: locations)
        {
            System.out.println(l.getDescription());
        }

        for (int i = 0; i < gridRows; i++)
        {
            for (int j = 0; j < gridColumns; j++)
            {
                if (!grid.getDescription(i, j).equals("location is empty"))
                {
                    System.out.println(grid.getDescription(i, j));
                }
            }
        }
    }
    
}

