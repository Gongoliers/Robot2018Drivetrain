package org.usfirst.frc.team5112.robot;

import org.usfirst.frc.team5112.robot.commands.ChangeOperatorControlController;
import org.usfirst.frc.team5112.robot.commands.DecreaseDrivetrainSpeed;
import org.usfirst.frc.team5112.robot.commands.DriveBackwards;
import org.usfirst.frc.team5112.robot.commands.DriveForwards;
import org.usfirst.frc.team5112.robot.commands.IncreaseDrivetrainSpeed;
import org.usfirst.frc.team5112.robot.commands.RotateDrivetrainClockwise;
import org.usfirst.frc.team5112.robot.commands.RotateDrivetrainCounterclockwise;
import org.usfirst.frc.team5112.robot.commands.Stop;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class OI {
	
	public static Joystick joystick;
	public static LogitechController controller;
	
	public static JoystickButton joystickButtonThree;
	public static JoystickButton joystickButtonFour;
	public static JoystickButton joystickButtonFive;
	public static JoystickButton joystickButtonSix;
	public static JoystickButton joystickButtonSeven;
	public static JoystickButton joystickButtonEight;
	public static JoystickButton joystickButtonNine;
	public static JoystickButton joystickButtonTen;
	public static JoystickButton joystickButtonEleven;
	public static JoystickButton joystickButtonTwelve;
	
	public OI() {
		joystick = new Joystick(0);
		controller = new LogitechController(1);
		
		joystickButtonThree  = new JoystickButton(joystick, 3);
		joystickButtonThree.whenPressed(new IncreaseDrivetrainSpeed());
		joystickButtonFour  = new JoystickButton(joystick, 4);
		joystickButtonFour.whenPressed(new DecreaseDrivetrainSpeed());
		joystickButtonFive  = new JoystickButton(joystick, 5);
		joystickButtonFive.whenPressed(new DriveForwards());
		joystickButtonSix  = new JoystickButton(joystick, 6);
		joystickButtonSix.whenPressed(new DriveBackwards());
		joystickButtonSeven  = new JoystickButton(joystick, 7);
		joystickButtonSeven.whenPressed(new RotateDrivetrainClockwise());
		joystickButtonEight  = new JoystickButton(joystick, 8);
		joystickButtonEight.whenPressed(new RotateDrivetrainCounterclockwise());
		joystickButtonNine  = new JoystickButton(joystick, 9);
		joystickButtonNine.whileHeld(new Stop());	
		joystickButtonTen  = new JoystickButton(joystick, 10);
		joystickButtonEleven  = new JoystickButton(joystick, 11);
		joystickButtonTwelve  = new JoystickButton(joystick, 12);
		
		
		controller.buttonA.whenPressed(new ChangeOperatorControlController());
//		controller.buttonB
//		controller.buttonX
//		controller.buttonY
//		controller.leftTrigger
//		controller.rightTrigger
//		controller.buttonBack
//		controller.buttonStart
//		controller.buttonJoystickLeft
//		controller.buttonJoystickRight
		
		
		SmartDashboard.putNumber("Drivetrain Speed: ", Robot.drivetrain.speed);
		SmartDashboard.putNumber("Drivetrain Speed Interval: ", Robot.drivetrain.interval);
	}
}
