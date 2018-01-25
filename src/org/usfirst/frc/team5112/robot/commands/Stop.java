package org.usfirst.frc.team5112.robot.commands;

import org.usfirst.frc.team5112.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class Stop extends Command {

    public Stop() {
    	requires(Robot.drivetrain);
    }

    protected void initialize() {
    	Robot.drivetrain.stop();
    }

    protected void execute() {
    	Robot.drivetrain.stop();
    }

    protected boolean isFinished() {
        return true;
    }

    protected void end() {
    	Robot.drivetrain.stop();
    }

    protected void interrupted() {
    	Robot.drivetrain.stop();
    }
}
