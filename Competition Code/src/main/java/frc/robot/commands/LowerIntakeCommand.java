// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;

import static frc.robot.Constants.*;
import frc.robot.subsystems.Intake;

public class LowerIntakeCommand extends CommandBase {
  // Creates command for lowering intake
  private Intake INTAKE;

  public LowerIntakeCommand(Intake INTAKE) {
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(INTAKE);
    this.INTAKE = INTAKE;
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize(){
    INTAKE.lowerIntake();
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {}

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
