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
        EntryController enCon = new EntryController();
        enCon.log("Lassana malsha");
        
        
        //2 commit 
        enCon.carEventDetected("Detect 001", true);
        
    }
    
}
