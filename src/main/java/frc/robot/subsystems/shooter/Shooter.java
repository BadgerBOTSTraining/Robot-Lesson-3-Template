package frc.robot.subsystems.shooter;

import static edu.wpi.first.units.Units.RotationsPerSecond;

import org.littletonrobotics.junction.Logger;

import edu.wpi.first.units.measure.AngularVelocity;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Shooter extends SubsystemBase {
    private final ShooterIOInputsAutoLogged inputs = new ShooterIOInputsAutoLogged();
    private final ShooterIO io;

    public Shooter(ShooterIO io) {
        this.io = io;
    }

    @Override
    public void periodic() {
        io.updateInputs(inputs);
        Logger.processInputs("Shooter", inputs);
    }

    public void setDutyCycle(AngularVelocity velocity) {
        io.setVelocity(velocity);
        Logger.recordOutput("Shooter/Requested Duty Cycle", velocity.in(RotationsPerSecond));
    }
}
