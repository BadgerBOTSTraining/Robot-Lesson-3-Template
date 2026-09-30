package frc.robot.subsystems.shooter;

import com.ctre.phoenix6.controls.DutyCycleOut;
import com.ctre.phoenix6.hardware.TalonFX;

import badgerutils.advantagekit.talonfx.TalonFXSignals;
import badgerutils.motor.MotorGroup;

public class ShooterIOReal implements ShooterIO {
    private TalonFX motor1 = new TalonFX(5);
    private TalonFX motor2 = new TalonFX(6);

    private MotorGroup motorGroup = new MotorGroup(motor1, motor2);

    private TalonFXSignals motor1Signals = new TalonFXSignals(motor1);
    private TalonFXSignals motor2Signals = new TalonFXSignals(motor2);

    private DutyCycleOut request = new DutyCycleOut(0);

    public ShooterIOReal() {
        motor1.getConfigurator().apply(ShooterConstants.config);
        motor2.getConfigurator().apply(ShooterConstants.config);
    }

    @Override
    public void updateInputs(ShooterIOInputs inputs) {
        inputs.motor1 = motor1Signals.createLoggedTalonFX();
        inputs.motor2 = motor2Signals.createLoggedTalonFX();
    }

    @Override
    public void setDutyCycle(double dutyCycle) {
        request.Output = dutyCycle;
        motorGroup.setControl(request);
    }
}
