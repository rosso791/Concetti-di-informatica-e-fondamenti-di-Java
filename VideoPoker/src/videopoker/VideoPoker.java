/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package videopoker;

/**
 *
 * @author Federico
 */
public class VideoPoker {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception{
       Mazzo m = new Mazzo();
       
       Mano player = new Mano();
       Mano pc = new Mano();
       
       m.mescola();
       for (int i =0; i<5;i++){
           player.addCarta(m.estrai());
           
       }
      
       
       player.ordina();
       
       for (int i =0; i<5;i++){
           Card c = player.getCard(i);
           System.out.println("Seme" +c.getSeme()+ "Numero" + c.getNumber() );
       }
       System.out.println(player.isTris());
        
    }
    
}
