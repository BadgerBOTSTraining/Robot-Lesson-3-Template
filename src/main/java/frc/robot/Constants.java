package frc.robot;

import edu.wpi.first.wpilibj.RobotBase;

public class Constants {
  public static final Mode simMode = Mode.SIM;
  public static final Mode currentMode = RobotBase.isReal() ? Mode.REAL : simMode;

  public static class CanIds {
    public static final int SHOOTER_LEFT_MOTOR_ID = 0;
    public static final int SHOOTER_RIGHT_MOTOR_ID = 1;
  }

  public static enum Mode {
    /** Running on a real robot. */
    REAL,

    /** Running a physics simulator. */
    SIM,

    /** Replaying from a log file. */
    REPLAY
  }
}