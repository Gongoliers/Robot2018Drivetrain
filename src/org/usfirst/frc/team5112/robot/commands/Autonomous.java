package org.usfirst.frc.team5112.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc.team5112.robot.Robot;

public class Autonomous extends Command {
	public Autonomous() {
		requires(Robot.drivetrain);
	}

	@Override
	protected void initialize() {
	}

	@Override
	protected void execute() {
		Robot.drivetrain.stop();
	}

	@Override
	protected boolean isFinished() {
		return false;
	}

	@Override
	protected void end() {
	}

	@Override
	protected void interrupted() {
	}
}
