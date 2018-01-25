package org.usfirst.frc.team5112.robot.commands;

import org.usfirst.frc.team5112.robot.OI;
import org.usfirst.frc.team5112.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class OperatorControl extends Command {

    public OperatorControl() {
    	requires(Robot.drivetrain);
    }

    protected void initialize() {
    }

    protected void execute() {
    	Robot.drivetrain.operatorControl(OI.joystick);
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
    }

    protected void interrupted() {
    	Robot.drivetrain.stop();
    }
}
