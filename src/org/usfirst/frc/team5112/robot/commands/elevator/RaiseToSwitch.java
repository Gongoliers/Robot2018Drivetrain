package org.usfirst.frc.team5112.robot.commands.elevator;

import org.usfirst.frc.team5112.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class RaiseToSwitch extends Command {

    public RaiseToSwitch() {
    	requires(Robot.elevator);
    }

    protected void initialize() {
    	Robot.elevator.stop();
    }

    protected void execute() {
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
    }

    protected void interrupted() {
    }
}
