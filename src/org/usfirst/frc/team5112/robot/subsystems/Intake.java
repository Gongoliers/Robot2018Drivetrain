package org.usfirst.frc.team5112.robot.subsystems;

import org.usfirst.frc.team5112.robot.RobotMap;
import org.usfirst.frc.team5112.robot.commands.intake.OperatorControlIntake;

import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * The Intake subsystem controls the intake wheels on the third stage
 * of the elevator and the intake wheels attached to the chassis of 
 * the robot.
 */

public class Intake extends Subsystem {

	public static SpeedControllerGroup motorController = RobotMap.intakeMotorController;
	public double interval = 0.05;
	public double speed = 0.00;
	
	
    public void initDefaultCommand() {
    	setDefaultCommand(new OperatorControlIntake());
    }
    
    //Stops the intake wheels
    public void stop() {
    	motorController.stopMotor();
    }
    
    //Runs the intake wheels to take in objects
    public void in(double speed) {
    	motorController.set(speed);
    }
    
    //Runs the intake wheels to spit objects out
    public void out(double speed) {
    	in(-speed);
    }
    
    //Adds a value to the intake's speed (for intake+outtake commands)
    public void changeSpeed(double interval) {
    	if (speed + interval >= 1.0) {
			speed = 1.0;
		} else if (speed + interval <= 0) {
			speed = 0.0;
		} else {
			speed += interval;
		}
    }
    
    //Allows xbox controller's right joystick's Y movement to control intake wheels in teleop
    public void OperatorControl(edu.wpi.first.wpilibj.XboxController xboxController) {
    	if (xboxController.getRawAxis(1) > 0.1 || xboxController.getRawAxis(1) < -0.1) {
			motorController.set(xboxController.getRawAxis(1));
		}
    	else {
    		motorController.stopMotor();
    	}
    }
}