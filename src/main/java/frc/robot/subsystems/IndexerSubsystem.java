// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix6.hardware.TalonFX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.IndexerConstants;

public class IndexerSubsystem extends SubsystemBase {
  private final TalonFX m_motor = new TalonFX(IndexerConstants.MOTOR_ID);
  private double m_speed = 0;

  public IndexerSubsystem() {

  }

  @Override
  public void periodic() {
    m_motor.set(m_speed);
  }

  public void toggle() {
    m_speed = (m_speed == 0) ? 1 : 0;
  }
}
