/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bcccp.Test;

import bcccp.carpark.entry.EntryController;

/**
 *
 * @author nathasha
 */
public class EntryControllerTest {
    
    
    
    public static void main(String[] args){
        
        //first commit log method and create test package 
       // EntryController enCon = new EntryController();
        //enCon.log("Lassana malsha");
        
        
        //2 commit 
       //enCon.carEventDetected("Detect 001", true);
        
        //Third commit test carEventDetecte method IDLE method
       // enCon.carEventDetected("Detect 002", true);
        
        //Fourth commit test carEventDetecte method IDLE method
       // enCon.carEventDetected("Detect 003", false);
        
        //sixth commit test carEventDetecte method IDLE method
      //  enCon.buttonPushed();
        
        //seventh commit test ticketInserted method
      //  enCon.ticketInserted("AAA001");
        
        //Ninth commit test notifyCarparkEvent method
       // enCon.notifyCarparkEvent();
        
        //First integration test test button pushed method
       // CarSensor os = new CarSensor("CAR1", 1, 2);
 		//EntryUI ui = new EntryUI(1, 2);
 		//EntryController controller = new EntryController(carpark, entryGate, os, is, ui);
       // controller.buttonPushed();
-		//controller.carEventDetected("CAR1", true);
        EntryController controller = new EntryController(carpark, entryGate, os, is, ui);
        controller.ticketInserted("bar1");
        controller.ticketTaken();
    }
    
}
