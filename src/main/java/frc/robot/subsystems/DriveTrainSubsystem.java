/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;

/**
 * Add your docs here.
 */
public class DriveTrainSubsystem extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }

  public void tankDrive()
  {
    RobotMap.leftFrontTalon.set(ControlMode.PercentOutput, RobotMap.leftJoystick.getY());
    RobotMap.leftBackTalon.set(ControlMode.PercentOutput, RobotMap.leftJoystick.getY());
    RobotMap.rightFrontTalon.set(ControlMode.PercentOutput, RobotMap.rightJoystick.getY());
    RobotMap.rightBackTalon.set(ControlMode.PercentOutput, RobotMap.rightJoystick.getY());
  }

  public void arcadeDrive()
  {
      RobotMap.leftFrontTalon.set(ControlMode.PercentOutput, RobotMap.leftJoystick.getY());
      RobotMap.rightFrontTalon.set(ControlMode.PercentOutput, RobotMap.leftJoystick.getY());
      RobotMap.leftBackTalon.set(ControlMode.PercentOutput, RobotMap.leftJoystick.getY());
      RobotMap.rightBackTalon.set(ControlMode.PercentOutput, RobotMap.leftJoystick.getY());

    if (RobotMap.rightJoystick.getX() > 10)
    {
      RobotMap.leftFrontTalon.set(ControlMode.PercentOutput, RobotMap.rightJoystick.getX());
      RobotMap.rightFrontTalon.set(ControlMode.PercentOutput, -RobotMap.rightJoystick.getX());
      RobotMap.leftBackTalon.set(ControlMode.PercentOutput, RobotMap.rightJoystick.getX());
      RobotMap.rightBackTalon.set(ControlMode.PercentOutput, -RobotMap.rightJoystick.getX());
    }

    if (RobotMap.rightJoystick.getX() < 10)
    {
      RobotMap.leftFrontTalon.set(ControlMode.PercentOutput, -RobotMap.rightJoystick.getX());
      RobotMap.rightFrontTalon.set(ControlMode.PercentOutput, RobotMap.rightJoystick.getX());
      RobotMap.leftBackTalon.set(ControlMode.PercentOutput, -RobotMap.rightJoystick.getX());
      RobotMap.rightBackTalon.set(ControlMode.PercentOutput, RobotMap.rightJoystick.getX());
    }
  }
}
