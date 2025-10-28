// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import static frc.robot.Constants.DriveConstants.*;

import com.revrobotics.spark.SparkMax;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Drive extends SubsystemBase {
  private final SparkMax m_leftFrontDrive = new SparkMax(kFrontLeftDriveCanId, kDriveMotorType);
  private final SparkMax m_leftRearDrive = new SparkMax(kRearLeftDriveCanId, kDriveMotorType);

  private final SparkMax m_rightFrontDrive = new SparkMax(kFrontRightDriveCanId, kDriveMotorType);
  private final SparkMax m_rightRearDrive = new SparkMax(kRearRightDriveCanId, kDriveMotorType);
 
  /** Creates a new Drive. */
  public Drive() {
    
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
