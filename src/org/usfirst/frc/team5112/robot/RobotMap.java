package org.usfirst.frc.team5112.robot;

import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

public class RobotMap {
	public static VictorSP rightMotorController;
	public static VictorSP leftMotorController;
	public static DifferentialDrive differentialDrive;
	
	public static void init() {
		rightMotorController = new VictorSP(0);
		rightMotorController.setInverted(true);
		leftMotorController = new VictorSP(1);
		leftMotorController.setInverted(true);
		
		differentialDrive = new DifferentialDrive(leftMotorController, rightMotorController);
		
		differentialDrive.setSafetyEnabled(false);
		differentialDrive.setExpiration(0.1);
		differentialDrive.setMaxOutput(1.0);
		
		differentialDrive.arcadeDrive(0.25, 0);

	}
}
