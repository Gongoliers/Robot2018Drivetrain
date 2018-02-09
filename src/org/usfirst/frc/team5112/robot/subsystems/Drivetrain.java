package org.usfirst.frc.team5112.robot.subsystems;

import org.usfirst.frc.team5112.robot.LogitechController;
import org.usfirst.frc.team5112.robot.RobotMap;
import org.usfirst.frc.team5112.robot.commands.drivetrain.OperatorControl;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 * The Drivetrain subsystem controls the chassis and wheels
 * that acutally move the entire body of the robot.
 */
public class Drivetrain extends Subsystem {
	private final DifferentialDrive diffDrive = RobotMap.diffDrive;
	public double throttle = 0.6;
	public double speed = 0;
	public double interval = 0.05;
	public int type = 0;


	public void initDefaultCommand() {
		setDefaultCommand(new OperatorControl());
		// setDefaultCommand(new Stop());
	}

	public void forwards(double speed) {
		diffDrive.arcadeDrive(-speed, 0);
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
		if ((speed + inte) >= 1.0) {
			speed = 1.0;
		} else if ((speed + inte) <= 0) {
			speed = 0;
		} else {
			speed += inte;
		}
		SmartDashboard.putNumber("Drivetrain Speed: ", speed);
	}

	public void setTurbo(Joystick joystick, LogitechController controller) {
		if (joystick.getRawButton(1) || controller.getRawButton(6)) {
			throttle = 1.0;
		} else {
			throttle = 0.6;
		}
	}
	
	public void changeControllerType() {
		if (type == 0) {
			type = 1;
		} else {
			type = 0;
		}
	}

	public void operatorControl(Joystick joystick, LogitechController controller, int type) {
		if (type == 0) {
			setTurbo(joystick, controller);
			if (joystick.getY() > 0.1 || joystick.getY() < -0.1) {
				diffDrive.arcadeDrive((joystick.getY() - 0.1) * 10 / 9 * throttle, 0);
			} else {
				diffDrive.arcadeDrive(0, joystick.getZ() * throttle);
			}
		} else {
			setTurbo(joystick, controller);
			if (controller.getRightYAxis() > 0.1 || controller.getRightYAxis() < -0.1) {
				diffDrive.arcadeDrive((controller.getRightYAxis() - 0.1) * 10 / 9 * throttle, 0);
			} else {
				diffDrive.arcadeDrive(0, controller.getRightXAxis() * throttle);
			}
		}
	}
}
