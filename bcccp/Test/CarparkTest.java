/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bcccp.Test;

import bcccp.carpark.Carpark;

/**
 *
 * @author nathasha
 */
public class CarparkTest {
    
    public static void main(String [] args){
        
        //10th commit check getname of the carpark class
            Carpark cCon=new Carpark();
            String c=cCon.getName();
            System.out.println(c);
            
            
        //11th commit check calculateAddHocTicketCharge method
           float charge=cCon. calculateAddHocTicketCharge(23);
           System.out.println(charge);
           
           //12th commit check isSeasonTicketValid method
           boolean state=cCon.isSeasonTicketValid("012356");
          System.out.println(state);
   
    }
   
    
}
