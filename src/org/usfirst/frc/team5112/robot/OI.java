package org.usfirst.frc.team5112.robot;

import org.usfirst.frc.team5112.robot.commands.drivetrain.*;
import org.usfirst.frc.team5112.robot.commands.intake.*;
import org.usfirst.frc.team5112.robot.commands.elevator.*;
import org.usfirst.frc.team5112.robot.commands.climber.*;


import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class OI {

	//Joystick + Controller Intializations
	public static Joystick joystickExtreme;
	public static Joystick joystickAttack;
	public static LogitechController logitechController;
	public static edu.wpi.first.wpilibj.XboxController xboxController;

	//Joystick Button Initilization
	public static JoystickButton jB1;
	public static JoystickButton jB2;
	public static JoystickButton jB3;
	public static JoystickButton jB4;
	public static JoystickButton jB5;
	public static JoystickButton jB6;
	public static JoystickButton jB7;
	public static JoystickButton jB8;
	public static JoystickButton jB9;
	public static JoystickButton jB10;
	public static JoystickButton jB11;
	public static JoystickButton jB12;

	public OI() {
		//Joysticks
		joystickExtreme = new Joystick(0);
		joystickAttack  = new Joystick(2);
		
		//Controllers
		logitechController = new LogitechController(1);
		xboxController = new XboxController(3);
		
		//Joystick Extreme's Buttons
		jB1 = new JoystickButton(joystickExtreme, 1);
		jB2 = new JoystickButton(joystickExtreme, 2);
		jB3 = new JoystickButton(joystickExtreme, 3);
		jB4 = new JoystickButton(joystickExtreme, 4);
		jB5 = new JoystickButton(joystickExtreme, 5);
		jB6 = new JoystickButton(joystickExtreme, 6);
		jB7 = new JoystickButton(joystickExtreme, 7);
		jB8 = new JoystickButton(joystickExtreme, 8);
		jB9 = new JoystickButton(joystickExtreme, 9);
		jB10 = new JoystickButton(joystickExtreme, 10);
		jB11 = new JoystickButton(joystickExtreme, 11);
		jB12 = new JoystickButton(joystickExtreme, 12);
		
		//Climber Commands
		SmartDashboard.putData("Stop CLimber", new StopClimber());
		
		//Drivetrain Commands
		SmartDashboard.putData("Drivetrain Backwards", new DriveBackwards());
		SmartDashboard.putData("Drivetrain Forwards", new DriveForwards());
		SmartDashboard.putData("Decrease Drivetrain Speed", new DecreaseDrivetrainSpeed());
		SmartDashboard.putData("Increase Drivetrain Speed", new IncreaseDrivetrainSpeed());
		SmartDashboard.putData("Rotate Drivetrain Counterclockwise", new RotateDrivetrainCounterclockwise());
		SmartDashboard.putData("Rotate Drivetrain Clockwise", new RotateDrivetrainClockwise());
		SmartDashboard.putData("Stop Drivetrain", new StopDrivetrain());
		
		//Elevator Commands
		SmartDashboard.putData("Lower Elevator To Bottom Position", new LowerToBottom());
		SmartDashboard.putData("Lower Elevator To Switch Position", new LowerToSwitch());
		SmartDashboard.putData("Raise Elevator To Switch", new RaiseToSwitch());
		SmartDashboard.putData("Raise Elevator To Scale", new RaiseToScale());
		SmartDashboard.putData("Raise Elevator To Top", new RaiseToTop());
		
		//Intake Commands
		SmartDashboard.putData("Decrease Intake Speed", new DecreaseSpeedIntake());
		SmartDashboard.putData("Increase Intake Speed", new IncreaseSpeedIntake());
		SmartDashboard.putData("Intake", new Intake());
		SmartDashboard.putData("Outtake", new Outtake());
		SmartDashboard.putData("Stop Intake", new StopIntake());
		
		//Command Groups
//		SmartDashboard.putData("Autonomous Scale Command", new AutoScaleCommand());
//		SmartDashboard.putData("Autonomous Switch Command", new AutoSwitchCommand());
//		SmartDashboard.putData("STOP EVERYTHING", new StopEverything());
	}
	
	
	
	
	
//	
//	public static Joystick joystick;
//	public static LogitechController controller;
//	
//	public static JoystickButton joystickButtonThree;
//	public static JoystickButton joystickButtonFour;
//	public static JoystickButton joystickButtonFive;
//	public static JoystickButton joystickButtonSix;
//	public static JoystickButton joystickButtonSeven;
//	public static JoystickButton joystickButtonEight;
//	public static JoystickButton joystickButtonNine;
//	public static JoystickButton joystickButtonTen;
//	public static JoystickButton joystickButtonEleven;
//	public static JoystickButton joystickButtonTwelve;
//	
//	public OI() {
//		joystick = new Joystick(0);
//		controller = new LogitechController(1);
//		
//		joystickButtonThree  = new JoystickButton(joystick, 3);
//		joystickButtonThree.whenPressed(new IncreaseDrivetrainSpeed());
//		joystickButtonFour  = new JoystickButton(joystick, 4);
//		joystickButtonFour.whenPressed(new DecreaseDrivetrainSpeed());
//		joystickButtonFive  = new JoystickButton(joystick, 5);
//		joystickButtonFive.whenPressed(new DriveForwards());
//		joystickButtonSix  = new JoystickButton(joystick, 6);
//		joystickButtonSix.whenPressed(new DriveBackwards());
//		joystickButtonSeven  = new JoystickButton(joystick, 7);
//		joystickButtonSeven.whenPressed(new RotateDrivetrainClockwise());
//		joystickButtonEight  = new JoystickButton(joystick, 8);
//		joystickButtonEight.whenPressed(new RotateDrivetrainCounterclockwise());
//		joystickButtonNine  = new JoystickButton(joystick, 9);
//		joystickButtonNine.whileHeld(new Stop());	
//		joystickButtonTen  = new JoystickButton(joystick, 10);
//		joystickButtonEleven  = new JoystickButton(joystick, 11);
//		joystickButtonTwelve  = new JoystickButton(joystick, 12);
//		
//		
//		controller.buttonA.whenPressed(new ChangeOperatorControlController());
////		controller.buttonB
////		controller.buttonX
////		controller.buttonY
////		controller.leftTrigger
////		controller.rightTrigger
////		controller.buttonBack
////		controller.buttonStart
////		controller.buttonJoystickLeft
////		controller.buttonJoystickRight
//		
//		
//		SmartDashboard.putNumber("Drivetrain Speed: ", Robot.drivetrain.speed);
//		SmartDashboard.putNumber("Drivetrain Speed Interval: ", Robot.drivetrain.interval);
//	}
}
