// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import com.revrobotics.spark.SparkLowLevel.MotorType;
import com.revrobotics.spark.config.SparkBaseConfig.IdleMode;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
  public static final class DriveConstants {
    // Drive motors - SparkMax Controller
    public static final int kFrontLeftDriveCanId = 1;
    public static final int kRearLeftDriveCanId = 3;
    public static final int kFrontRightDriveCanId = 2;
    public static final int kRearRightDriveCanId = 4;
    public static final MotorType kDriveMotorType = MotorType.kBrushed;
    public static final double SPEED = .5;
    public static final IdleMode kDriveIdleMode = IdleMode.kBrake;
    public static final int kDriveMotorCurrentLimit = 30;
    public static double kDriveFactor = .5; // changed for turbo
    public static double kTurnFactor = .5;
    public static int kDriveReverse = 1; // Default drive; 1 = Front is panel, -1 = Front is intake
  }

  public static final class ShooterConstants {
    // SparkMax Controllers
    public static final int kLeftShooterCanId = 11;
    public static final int kRightShooterCanId = 12;
  }
  public static class OperatorConstants {
    public static final int kDriverControllerPort = 0;

  }
}
