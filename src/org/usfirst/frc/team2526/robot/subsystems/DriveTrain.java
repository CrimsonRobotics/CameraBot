package org.usfirst.frc.team2526.robot.subsystems;


import org.usfirst.frc.team2526.robot.Robot;

import com.ctre.CANTalon;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

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
	CANTalon turnMotor;
	RobotDrive myDrive;
	Double angle;
	/*frontLeft = new CANTalon(9);
	frontRight = new CANTalon(8);
	backLeft = new CANTalon(1);
	backRight = new CANTalon(2);*/
	public DriveTrain() {
		/*frontLeft = new CANTalon(9);
    	frontRight = new CANTalon(8);
    	backLeft = new CANTalon(1);
    	backRight = new CANTalon(2);
		myDrive = new RobotDrive(frontLeft, backLeft, frontRight, backRight);*/
		turnMotor = new CANTalon(9);
		
	}
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
   public void turnWithCamera() {
	   double angleset = Robot.camera.getCameraAngle();
	   System.out.println("One" + angleset);
	   SmartDashboard.putNumber("Angle First", angleset);
	   while(angleset>1 || angleset<-1) {
		   angleset = Robot.camera.getCameraAngle();
		   if(angleset != 10000.0) {
		   System.out.println("Two" + angleset);
	   if(angleset>1)
		   turnMotor.set(.07);
	//	myDrive.drive(.5, .5);
	   else if(angleset<-1)
		  turnMotor.set(-.07);
		   //myDrive.drive(.5, -.5);
	   else if(angleset >= -1 && angleset <= 1)
		  turnMotor.set(0);
		  // myDrive.drive(0, 0);
		  
	   }
	   }
	   
   }
   
}

