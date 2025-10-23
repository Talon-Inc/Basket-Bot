// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import static frc.robot.Constants.DriveConstants.*;

import com.revrobotics.spark.SparkMax;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Drive extends SubsystemBase {
  private final SparkMax m_leftFrontDrive = new SparkMax(DRIVE_LEFT_FRONT_MOTOR, DRIVE_MOTOR_TYPE);
  private final SparkMax m_leftBackDrive = new SparkMax(DRIVE_LEFT_BACK_MOTOR, DRIVE_MOTOR_TYPE);

  private final SparkMax m_rightFrontDrive = new SparkMax(DRIVE_RIGHT_FRONT_MOTOR, DRIVE_MOTOR_TYPE);
  private final SparkMax m_rightBackDrive = new SparkMax(DRIVE_RIGHT_BACK_MOTOR, DRIVE_MOTOR_TYPE);
 
  /** Creates a new Drive. */
  public Drive() {

  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
