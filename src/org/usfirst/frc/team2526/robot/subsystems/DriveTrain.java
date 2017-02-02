package org.usfirst.frc.team2526.robot.subsystems;


import org.usfirst.frc.team2526.robot.Robot;

import com.ctre.CANTalon;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class DriveTrain extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	CANTalon frontLeft;
	CANTalon frontRight;
	CANTalon backLeft;
	CANTalon backRight;
	RobotDrive myDrive;
	Double angle;
	/*frontLeft = new CANTalon(9);
	frontRight = new CANTalon(8);
	backLeft = new CANTalon(1);
	backRight = new CANTalon(2);*/
	public DriveTrain() {
		frontLeft = new CANTalon(9);
    	frontRight = new CANTalon(8);
    	backLeft = new CANTalon(1);
    	backRight = new CANTalon(2);
		myDrive = new RobotDrive(frontLeft, backLeft, frontRight, backRight);
		
	}
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
   public void turnWithCamera() {
	   if(Robot.camera.getAngle()>1)
		   myDrive.drive(.5, .5);
	   else if(Robot.camera.getAngle()<-1)
		   myDrive.drive(.5, -.5);
	   
   }
   
}

