package org.firstinspires.ftc.teamcode.Robot;

import com.qualcomm.robotcore.hardware.Gamepad;

/**
 * This interface is used to describe the behavior of a robot
 */
interface Robot extends Computer {
    /**
     * initialize the hardware of the Robot
     **/
    void init();

    void drive(Gamepad gamepad1, Gamepad gamepad2);
}
