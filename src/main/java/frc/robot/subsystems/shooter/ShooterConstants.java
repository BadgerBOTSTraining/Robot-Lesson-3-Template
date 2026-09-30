package frc.robot.subsystems.shooter;

import static edu.wpi.first.units.Units.Amps;

import com.ctre.phoenix6.configs.TalonFXConfiguration;
import com.ctre.phoenix6.hardware.TalonFX;
import com.ctre.phoenix6.signals.InvertedValue;
import com.ctre.phoenix6.signals.NeutralModeValue;

import badgerutils.motor.MotorConfigUtils;

public class ShooterConstants {
    public static final TalonFXConfiguration config = new TalonFXConfiguration()
        .withMotorOutput(MotorConfigUtils.createMotorOutputConfig(InvertedValue.Clockwise_Positive, NeutralModeValue.Coast))
        .withCurrentLimits(MotorConfigUtils.createCurrentLimitsConfig(Amps.of(60), Amps.of(80)));
}
