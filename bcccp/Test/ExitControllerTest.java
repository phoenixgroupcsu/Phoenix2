/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bcccp.Test;

import bcccp.carpark.exit.ExitController;
import bcccp.carpark.CarSensor;
import bcccp.carpark.Carpark;
import bcccp.carpark.Gate;
import bcccp.carpark.entry.EntryUI;
import bcccp.carpark.exit.ExitController;
import bcccp.carpark.exit.ExitUI;
import bcccp.tickets.adhoc.AdhocTicketDAO;
import bcccp.tickets.adhoc.AdhocTicketFactory;
import bcccp.tickets.season.SeasonTicketDAO;
import bcccp.tickets.season.UsageRecordFactory;

/**
 *
 * @author nathasha
 */
public class ExitControllerTest {
 
    public static void main(String [] args){
        
     AdhocTicketFactory adhocTicketFactory = new AdhocTicketFactory();
		AdhocTicketDAO adhocTicketDAO = new AdhocTicketDAO(adhocTicketFactory);
	UsageRecordFactory factory = new UsageRecordFactory();
		SeasonTicketDAO seasonTicketDAO = new SeasonTicketDAO(factory);

		Carpark carpark = new Carpark("Gulani_CAR", 15, adhocTicketDAO, seasonTicketDAO);
		Gate entryGate = new Gate(1, 2);
		Gate exitGate = new Gate(2, 3);
		CarSensor is = new CarSensor("CAR1", 1, 2);
		CarSensor os = new CarSensor("CAR1", 2, 3);
		EntryUI ui = new EntryUI(1, 2);
		ExitUI exitUI = new ExitUI(2, 3);

		ExitController exitController = new ExitController(carpark, exitGate, is, os, exitUI);
		//exitController.log("Welcome for testing");
	    //exitController.carEventDetected("Exit Car 2", true);
        //ExitController exit=new ExitController();
        
        //13th commit test carEventDetected
       // exit.carEventDetected("A1562", true);
        
        //14th commit test carEventDetected and set state as idle
        //exit.carEventDetected("A1562", true);
        
        exitController.setState(null);
		exitController.carEventDetected("Exit Car 2", true);
        
    }
}
