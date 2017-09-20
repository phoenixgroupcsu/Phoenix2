/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bcccp.Test;

import bcccp.carpark.exit.ExitController;

/**
 *
 * @author nathasha
 */
public class ExitControllerTest {
 
    public static void main(String [] args){
        
        ExitController exit=new ExitController();
        
        //13th commit test carEventDetected
        exit.carEventDetected("A1562", true);
        
        
        
    }
}
