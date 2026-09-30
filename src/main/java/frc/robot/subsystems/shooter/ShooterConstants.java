package frc.robot.subsystems.shooter;

import static edu.wpi.first.units.Units.Amps;

import com.ctre.phoenix6.configs.TalonFXConfiguration;
import com.ctre.phoenix6.hardware.TalonFX;
import com.ctre.phoenix6.signals.GravityTypeValue;
import com.ctre.phoenix6.signals.InvertedValue;
import com.ctre.phoenix6.signals.NeutralModeValue;
import com.ctre.phoenix6.signals.StaticFeedforwardSignValue;

import badgerutils.motor.MotorConfigUtils;

public class ShooterConstants {
    public static final double KP = 0, KD = 0, KS = 0, KV = 0;

    public static final TalonFXConfiguration config = new TalonFXConfiguration()
        .withMotorOutput(MotorConfigUtils.createMotorOutputConfig(InvertedValue.Clockwise_Positive, NeutralModeValue.Coast))
        .withCurrentLimits(MotorConfigUtils.createCurrentLimitsConfig(Amps.of(60), Amps.of(80)))
        .withSlot0(MotorConfigUtils.createSlotConfig(KP, KD, KS, KV, 0, GravityTypeValue.Arm_Cosine, StaticFeedforwardSignValue.UseVelocitySign));
}
