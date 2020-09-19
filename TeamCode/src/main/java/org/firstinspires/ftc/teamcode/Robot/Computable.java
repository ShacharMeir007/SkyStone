package org.firstinspires.ftc.teamcode.Robot;

public class Computable<T> {
    Computer computer;
    DeviceTag tag;
    T value;

    public Computable(Computer computer, DeviceTag tag, T initialValue)
    {
        this.computer = computer;
        this.tag = tag;
        this.value = initialValue;
    }


    public T get() {
        return this.value;
    }


    public void set(T value) {
        this.value = value;
    }
}
