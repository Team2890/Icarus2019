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
    RobotMap.rightFrontTalon.set(ControlMode.PercentOutput, -RobotMap.rightJoystick.getY());
    RobotMap.rightBackTalon.set(ControlMode.PercentOutput, -RobotMap.rightJoystick.getY());
  }

  public void arcadeDrive()
  {
    if (RobotMap.leftJoystick.getY() > 0.15)
    {
      System.out.println("Backwards");
      System.out.println(RobotMap.leftJoystick.getY());
      RobotMap.leftFrontTalon.set(ControlMode.PercentOutput, RobotMap.leftJoystick.getY());
      RobotMap.rightFrontTalon.set(ControlMode.PercentOutput, RobotMap.leftJoystick.getY());
      RobotMap.leftBackTalon.set(ControlMode.PercentOutput, RobotMap.leftJoystick.getY());
      RobotMap.rightBackTalon.set(ControlMode.PercentOutput, RobotMap.leftJoystick.getY());
    }

    
    if (RobotMap.leftJoystick.getY() < -0.15)
    {
      System.out.println("Forwards");
      System.out.println(RobotMap.leftJoystick.getY());
      RobotMap.leftFrontTalon.set(ControlMode.PercentOutput, RobotMap.leftJoystick.getY());
      RobotMap.rightFrontTalon.set(ControlMode.PercentOutput, RobotMap.leftJoystick.getY());
      RobotMap.leftBackTalon.set(ControlMode.PercentOutput, RobotMap.leftJoystick.getY());
      RobotMap.rightBackTalon.set(ControlMode.PercentOutput, RobotMap.leftJoystick.getY());
    }

    if (RobotMap.rightJoystick.getX() > 0.15)
    {
      System.out.println("Right");
      System.out.println(RobotMap.rightJoystick.getX());
      RobotMap.leftFrontTalon.set(ControlMode.PercentOutput, RobotMap.rightJoystick.getX());
      RobotMap.rightFrontTalon.set(ControlMode.PercentOutput, -RobotMap.rightJoystick.getX());
      RobotMap.leftBackTalon.set(ControlMode.PercentOutput, RobotMap.rightJoystick.getX());
      RobotMap.rightBackTalon.set(ControlMode.PercentOutput, -RobotMap.rightJoystick.getX());
    }

    if (RobotMap.rightJoystick.getX() < -0.15)
    {
        System.out.println("Left");
        System.out.println(RobotMap.rightJoystick.getX());
        RobotMap.leftFrontTalon.set(ControlMode.PercentOutput, RobotMap.rightJoystick.getX());
        RobotMap.rightFrontTalon.set(ControlMode.PercentOutput, -RobotMap.rightJoystick.getX());
        RobotMap.leftBackTalon.set(ControlMode.PercentOutput, RobotMap.rightJoystick.getX());
        RobotMap.rightBackTalon.set(ControlMode.PercentOutput, -RobotMap.rightJoystick.getX());
    }

    if (RobotMap.middleButtonLeft.get() == true)
    {
      RobotMap.leftFrontTalon.set(ControlMode.PercentOutput, 0);
      RobotMap.rightFrontTalon.set(ControlMode.PercentOutput, 0);
      RobotMap.leftBackTalon.set(ControlMode.PercentOutput, 0);
      RobotMap.rightBackTalon.set(ControlMode.PercentOutput, 0);
    }

    if (RobotMap.middleButtonRight.get() == true)
    {
      RobotMap.leftFrontTalon.set(ControlMode.PercentOutput, 0);
      RobotMap.rightFrontTalon.set(ControlMode.PercentOutput, 0);
      RobotMap.leftBackTalon.set(ControlMode.PercentOutput, 0);
      RobotMap.rightBackTalon.set(ControlMode.PercentOutput, 0);
    }


    /*if (RobotMap.rightJoystick.getX() > -0.15 && RobotMap.rightJoystick.getX() < 0.15)
    {
      RobotMap.leftFrontTalon.set(ControlMode.PercentOutput, 0);
      RobotMap.rightFrontTalon.set(ControlMode.PercentOutput, 0);
      RobotMap.leftBackTalon.set(ControlMode.PercentOutput, 0);
      RobotMap.rightBackTalon.set(ControlMode.PercentOutput, 0);
    }
    if (RobotMap.leftJoystick.getY() > -0.15 && RobotMap.leftJoystick.getY() < 0.15)
    {
      RobotMap.leftFrontTalon.set(ControlMode.PercentOutput, 0);
      RobotMap.rightFrontTalon.set(ControlMode.PercentOutput, 0);
      RobotMap.leftBackTalon.set(ControlMode.PercentOutput, 0);
      RobotMap.rightBackTalon.set(ControlMode.PercentOutput, 0);
    }*/
  }
}
