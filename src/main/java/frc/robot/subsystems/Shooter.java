// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import static frc.robot.Constants.ShooterConstants.*;

import com.revrobotics.spark.SparkBase.PersistMode;
import com.revrobotics.spark.SparkBase.ResetMode;
import com.revrobotics.spark.SparkMax;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Configs;

public class Shooter extends SubsystemBase {
  private final SparkMax m_leftShooterMotor = new SparkMax(kLeftShooterCanId, kShooterMotorType);
  private final SparkMax m_rightShooterMotor = new SparkMax(kRightShooterCanId, kShooterMotorType);

  /** Creates a new Shooter. */
  public Shooter() {
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
    m_leftShooterMotor.configure(
        Configs.Shooter.leftShooter,
        ResetMode.kResetSafeParameters,
        PersistMode.kPersistParameters);

    m_rightShooterMotor.configure(
        Configs.Shooter.rightShooter,
        ResetMode.kResetSafeParameters,
        PersistMode.kPersistParameters);
  }

  public void shoot() {
    m_leftShooterMotor.set(1);
    m_rightShooterMotor.set(1);
  }
  
  public void stop() {
    m_leftShooterMotor.stopMotor();
    m_rightShooterMotor.stopMotor();
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
