package frc.robot.subsystems.shooter;

import org.littletonrobotics.junction.AutoLog;

import badgerutils.advantagekit.talonfx.LoggedTalonFX;

public interface ShooterIO {
    @AutoLog
    public class ShooterIOInputs {
        public LoggedTalonFX motor1;
        public LoggedTalonFX motor2;
    }

    public void updateInputs(ShooterIOInputs inputs);

    public void setDutyCycle(double dutyCycle);


}
