package org.usfirst.frc.team5112.robot.subsystems;

import org.usfirst.frc.team5112.robot.Robot;
import org.usfirst.frc.team5112.robot.RobotMap;
import org.usfirst.frc.team5112.robot.commands.OperatorControl;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class Drivetrain extends Subsystem {
	private final DifferentialDrive diffDrive = RobotMap.diffDrive;
	public double throttle = 0.6;
	public double speed = 0;
	public double interval = 0.05;

	public void initDefaultCommand() {
		setDefaultCommand(new OperatorControl());
	}

	public void forwards(double speed) {
		diffDrive.arcadeDrive(speed, 0);
	}

	public void backwards(double speed) {
		forwards(-speed);
	}

	public void rotateClockwise(double speed) {
		diffDrive.arcadeDrive(0, speed);
	}

	public void rotateCounterclockwise(double speed) {
		rotateClockwise(-speed);
	}

	public void stop() {
		diffDrive.stopMotor();
	}
	
	public void setSpeed(double inte) {
		if ((speed += inte) >= 1.0) {
			speed = 1.0;
		} else if((speed += inte) <= 0) {
			speed = 0;
		} else {
			speed += inte;
		}
		SmartDashboard.putNumber("Drivetrain Speed: ", Robot.drivetrain.speed);
	}

	public void setTurbo(Joystick joystick) {
		if (joystick.getRawButtonPressed(1)) {
			throttle = 1.0;
		} else {
			throttle = 0.6;
		}
	}

	public void operatorControl(Joystick joystick) {
		setTurbo(joystick);
		if (joystick.getY() > 0.1 || joystick.getY() < -0.1) {
			diffDrive.arcadeDrive((joystick.getY() - 0.1) * 10 / 9 * throttle, 0);
		} else {
			diffDrive.arcadeDrive(0, joystick.getY());
		}
	}
}
