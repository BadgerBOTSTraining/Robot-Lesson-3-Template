package frc.robot.subsystems.shooter;

import static edu.wpi.first.units.Units.DegreesPerSecond;
import static edu.wpi.first.units.Units.RotationsPerSecond;

import org.littletonrobotics.junction.Logger;

import edu.wpi.first.units.VelocityUnit;
import edu.wpi.first.units.measure.AngularVelocity;
import edu.wpi.first.units.measure.Velocity;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;
import edu.wpi.first.wpilibj2.command.StartEndCommand;
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

    public void setVelocity(AngularVelocity velocity) {
        io.setVelocity(velocity);
        Logger.recordOutput("Shooter/Requested Duty Cycle", velocity.in(RotationsPerSecond));
    }

    public Command runShooterCommand(AngularVelocity velocity) {
        return new StartEndCommand(() -> setVelocity(velocity), () -> setVelocity(RotationsPerSecond.of(0)), this);
    }
}
