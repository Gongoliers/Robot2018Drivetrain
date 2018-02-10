package org.usfirst.frc.team5112.robot.subsystems;

import org.usfirst.frc.team5112.robot.RobotMap;
import org.usfirst.frc.team5112.robot.commands.elevator.OperatorControlElevator;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * The Elevator subsytem controls the winch on the elevator.
 */
public class Elevator extends Subsystem {

	public static SpeedControllerGroup motorController = RobotMap.elevatorMotorController;
	
    public void initDefaultCommand() {
    	setDefaultCommand(new OperatorControlElevator());
    }
    
    //Stops the elevator winch
    public void stop() {
    	motorController.stopMotor();
    }
    
    //Rotates the elevator winch clockwise
    public void rotateClockwise(double speed) {
    	motorController.set(speed);
    }
    
    //Rotates the elevator winch counterclockwise
    public void rotateCounterClockwise(double speed) {
    	rotateClockwise(-speed);
    }
    
    //Allows elevator winch to be controllerd by joystickAttack in teleop
    public void operatorControl(Joystick joystick) {
    	if (joystick.getY() > 0.1 || joystick.getY() < -.1) {
    		motorController.set(joystick.getY());
		} else {
			motorController.stopMotor();
		}
    }

}

