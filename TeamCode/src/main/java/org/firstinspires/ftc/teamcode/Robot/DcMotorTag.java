package org.firstinspires.ftc.teamcode.Robot;

import com.qualcomm.robotcore.hardware.DcMotor;

enum DcMotorTag implements DeviceTag{
    //values
    uL,uR,bL,bR;

    @Override
    public Class<?> getDeviceClass() {
        return DcMotor.class;
    }

    @Override
    public String getName() {
        return this.name();
    }
}
