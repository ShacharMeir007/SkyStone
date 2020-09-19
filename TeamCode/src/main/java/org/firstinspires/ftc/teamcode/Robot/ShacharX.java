package org.firstinspires.ftc.teamcode.Robot;

import android.util.Pair;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Gamepad;
import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.teamcode.Robot.MotorSetup.MechanicSetup;
import org.firstinspires.ftc.teamcode.Robot.MotorSetup.MotorsSetup;
import org.firstinspires.ftc.teamcode.Robot.MotorSetup.PropulsionSystem;

import java.util.Dictionary;

/**
 * This is an example of an implementation of a {@link Robot}.
 * It can be modified for your needs(not recommended),
 * or be used as a reference class.
 */
public class ShacharX implements Robot {
    private HardwareMap hardwareMap;
    private Dictionary<DcMotorTag, DcMotorExtension> motors;


    private PropulsionSystem propulsionSystem;

    public ShacharX(HardwareMap hardwareMap) {
        this.hardwareMap = hardwareMap;

    }

    @Override
    public void init() {
        for (DcMotorTag tag: DcMotorTag.values()) {
            this.motors.put(tag,new DcMotorExtension(this,this.hardwareMap.dcMotor.get(tag.name())));


        }


        propulsionSystem = new PropulsionSystem(
                new MechanicSetup(
                        motors.get(DcMotorTag.uL).speed,
                        motors.get(DcMotorTag.uR).speed,
                        motors.get(DcMotorTag.bL).speed,
                        motors.get(DcMotorTag.bR).speed));

    }

    @Override
    public void drive(Gamepad gamepad1, Gamepad gamepad2) {
        propulsionSystem.drive(gamepad1.left_stick_x, gamepad1.left_stick_y, gamepad1.right_stick_x);
    }

    @Override
    public void Update(DeviceTag tag) {

    }
}
