package org.firstinspires.ftc.teamcode.Robot.MotorSetup;

public class PropulsionSystem {
    MotorsSetup setup;

    public PropulsionSystem(MotorsSetup setup) {
        this.setup = setup;
    }

    public void drive(double x, double y, double z){
        setup.setSpeeds(x, y, z);
    }

    public void stop(){
        setup.setSpeeds(0, 0, 0);
    }
}
