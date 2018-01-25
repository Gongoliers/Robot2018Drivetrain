package org.usfirst.frc.team5112.robot.commands;

import org.usfirst.frc.team5112.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class DriveForwards extends Command {

    public DriveForwards() {
    	requires(Robot.drivetrain);
    }

    protected void initialize() {
    	Robot.drivetrain.stop();
    }

    protected void execute() {
    	Robot.drivetrain.forwards(Robot.drivetrain.speed);
    }

    protected boolean isFinished() {
        return true;
    }

    protected void end() {
    }

    protected void interrupted() {
    	Robot.drivetrain.stop();
    }
}
