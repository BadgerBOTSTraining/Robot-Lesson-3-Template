package frc.robot.subsystems.shooter;

import org.littletonrobotics.junction.Logger;

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

    public void setDutyCycle(double dutyCycle) {
        io.setDutyCycle(dutyCycle);
        Logger.recordOutput("Shooter/Requested Duty Cycle", dutyCycle);
    }
}
