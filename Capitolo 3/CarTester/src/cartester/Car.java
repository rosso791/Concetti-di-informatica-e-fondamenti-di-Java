/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cartester;

/**
 *
 * @author Federico
 */
public class Car {
    private double resa; //litri consumati al km
    private double litriInSerbatoio;
    private final double capacitaSerbatoio = 40;
    
    public Car(double resa)
    {
        litriInSerbatoio = 0;
        this.resa = resa;
    }
    
    public double getGasInTank()
    {
        return litriInSerbatoio;
    }
    
    public void addGas(double liters)
    {
        if(litriInSerbatoio + liters > capacitaSerbatoio)
            litriInSerbatoio = capacitaSerbatoio;
        else
            litriInSerbatoio += liters;
    }
    
    public void drive(double km)
    {
        if (km * resa > litriInSerbatoio)
        {
            System.out.println("Autonomia non sufficiente per " + km + " km.");
            return;
        }
        
        litriInSerbatoio -= km * resa;
    }
   
}
