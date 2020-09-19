package org.firstinspires.ftc.teamcode.Robot.MotorSetup;


import org.firstinspires.ftc.teamcode.Robot.Computable;

public class MechanicSetup implements MotorsSetup {
    private final SpeedEquation uLSpeed = new SpeedEquation(1, 1, 1);
    private final SpeedEquation uRSpeed = new SpeedEquation(-1, 1, 1);;
    private final SpeedEquation bLSpeed = new SpeedEquation(1, -1, 1);;
    private final SpeedEquation bRSpeed = new SpeedEquation(-1, -1, 1);;
    Computable<Double> uL, uR, bL, bR;
    public MechanicSetup(Computable<Double> uL, Computable<Double> uR, Computable<Double> bL, Computable<Double> bR) {
        this.uL = uL;
        this.uR = uR;
        this.bL = bL;
        this.bR = bR;
    }

    @Override
    public void setSpeeds(double x, double y, double z) {
        double ul = uLSpeed.calculate(x, y, z);
        double ur = uRSpeed.calculate(x, y, z);
        double bl = bLSpeed.calculate(x, y, z);
        double br = bRSpeed.calculate(x, y, z);
        double max = Math.max(ul, Math.max(ur, Math.max(bl, br)));
        ul/= max;
        ur/= max;
        bl/= max;
        br/= max;

        uL.set(ul);
        uR.set(ur);
        bL.set(bl);
        bR.set(br);

    }


}
