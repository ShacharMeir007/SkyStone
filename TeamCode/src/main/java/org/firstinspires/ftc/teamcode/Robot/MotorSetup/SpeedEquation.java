package org.firstinspires.ftc.teamcode.Robot.MotorSetup;

public class SpeedEquation {
    double a, b, c;

    public SpeedEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double calculate(double x, double y, double z){
        return a * x + b * y + c * z;
    }
}
