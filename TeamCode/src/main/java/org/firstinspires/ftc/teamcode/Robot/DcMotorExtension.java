package org.firstinspires.ftc.teamcode.Robot;

import com.qualcomm.robotcore.hardware.DcMotor;

public class DcMotorExtension {
    public DcMotor motor;
    public Computable<Double> speed;

    public DcMotorExtension(Computer computer,DcMotor motor) {
        this.motor = motor;
        speed = new Computable<>(computer,DcMotorTag.valueOf(motor.getDeviceName()),0.0);
    }
}
