package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

import org.firstinspires.ftc.teamcode.Robot.ShacharX;


@TeleOp(name="FirstOpMode", group="Iterative Opmode")
@Disabled
class ControllerDrive extends OpMode {
    private ShacharX shacharX = new ShacharX(hardwareMap);

    @Override
    public void init() {
        shacharX.init();
    }

    @Override
    public void init_loop() {

    }

    @Override
    public void start() {
        hardwareMap.getAll(DcMotor.class);

    }

    @Override
    public void loop() {
        shacharX.drive(gamepad1, gamepad2);
    }

    @Override
    public void stop() {

    }
}
