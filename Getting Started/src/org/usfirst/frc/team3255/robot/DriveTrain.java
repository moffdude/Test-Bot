package org.usfirst.frc.team3255.robot;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class DriveTrain extends Subsystem {
	
	//Talons
	
    Talon leftTalon = null;
    Talon rightTalon = null;
    
    //Encoders
    Encoder leftEncoder = null;
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void setSpeed(double s) {
    	leftTalon.set(s);
    	rightTalon.set(s);
    }
    
}

