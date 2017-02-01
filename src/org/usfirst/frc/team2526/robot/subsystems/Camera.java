package org.usfirst.frc.team2526.robot.subsystems;

import java.util.logging.Level;
import java.util.logging.Logger;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.networktables.NetworkTable;

/**
 *
 */
public class Camera extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

	static NetworkTable table;
public Camera() {
	table.setServerMode();
	table = NetworkTable.getTable("datatable");
	
	
}
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    public static Double getCameraAngle() {
    	while(true){
    		try{
    	        Thread.sleep(250);
    	    } catch (InterruptedException ex)
    	        {
    	Logger.getLogger(Camera.class.getName()).log(Level.SEVERE, null, ex);
    	        }
    		Double angle = table.getNumber("Angle", -100000.0);
    		return angle;
    		}
    }
    
   
  
}

