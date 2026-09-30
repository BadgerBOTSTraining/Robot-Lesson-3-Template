package frc.robot.subsystems.shooter;

import org.littletonrobotics.junction.AutoLog;

import badgerutils.advantagekit.talonfx.LoggedTalonFX;
import edu.wpi.first.units.measure.AngularVelocity;

public interface ShooterIO {
    @AutoLog
    public class ShooterIOInputs {
        public LoggedTalonFX motor1;
        public LoggedTalonFX motor2;
    }

    public void updateInputs(ShooterIOInputs inputs);

    public void setVelocity(AngularVelocity velocity);


}
