package org.usfirst.frc.team5112.robot;

import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

public class RobotMap {
	public static VictorSP rightMotorController;
	public static VictorSP leftMotorController;
	public static DifferentialDrive diffDrive;
	
	public static void init() {
		rightMotorController = new VictorSP(0);
		rightMotorController.setInverted(true);
		leftMotorController = new VictorSP(1);
		leftMotorController.setInverted(true);
		
		diffDrive = new DifferentialDrive(leftMotorController, rightMotorController);
		
		diffDrive.setSafetyEnabled(true);
		diffDrive.setExpiration(0.1);
		diffDrive.setMaxOutput(1.0);


	}
}
