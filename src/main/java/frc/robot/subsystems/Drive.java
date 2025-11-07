// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import static frc.robot.Constants.DriveConstants.*;

import com.revrobotics.spark.SparkBase.PersistMode;
import com.revrobotics.spark.SparkBase.ResetMode;
import com.revrobotics.spark.SparkMax;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Configs;

public class Drive extends SubsystemBase {
  private final SparkMax m_frontLeftDrive = new SparkMax(kFrontLeftDriveCanId, kDriveMotorType);
  private final SparkMax m_rearLeftDrive = new SparkMax(kRearLeftDriveCanId, kDriveMotorType);

  private final SparkMax m_frontRightDrive = new SparkMax(kFrontRightDriveCanId, kDriveMotorType);
  private final SparkMax m_rearRightDrive = new SparkMax(kRearRightDriveCanId, kDriveMotorType);
 
  /** Creates a new Drive. */
  public Drive() {
    /*
     * Apply the appropriate configurations to the SPARKs.
     *
     * kResetSafeParameters is used to get the SPARK to a known state. This
     * is useful in case the SPARK is replaced.
     *
     * kPersistParameters is used to ensure the configuration is not lost when
     * the SPARK loses power. This is useful for power cycles that may occur
     * mid-operation.
     */
    m_frontLeftDrive.configure(
        Configs.Shooter.leftShooter,
        ResetMode.kResetSafeParameters,
        PersistMode.kPersistParameters);

    m_rearLeftDrive.configure(
        Configs.Shooter.rightShooter,
        ResetMode.kResetSafeParameters,
        PersistMode.kPersistParameters);

    m_frontRightDrive.configure(
        Configs.Shooter.leftShooter,
        ResetMode.kResetSafeParameters,
        PersistMode.kPersistParameters);

    m_rearRightDrive.configure(
        Configs.Shooter.rightShooter,
        ResetMode.kResetSafeParameters,
        PersistMode.kPersistParameters);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
