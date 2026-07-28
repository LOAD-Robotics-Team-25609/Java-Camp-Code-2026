package org.firstinspires.ftc.teamcode.mechanisms;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.HardwareMap;
import org.firstinspires.ftc.robotcore.external.navigation.CurrentUnit;
public class Dylan_current_testing_pro_board {
    private DcMotorEx motor;
    private double ticksPerRotation;

public void init (HardwareMap hwMap) {
    motor = hwMap.get(DcMotorEx.class, "intake");
motor=hwMap.get(DcMotorEx.class,"intake");
// "intake" is just pod motor //
motor.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
ticksPerRotation=motor.getMotorType().getTicksPerRev();

}

    public void setMotorSpeed(double speed){
    motor.setPower(speed);
    }
    public double getMotorRotations(){
    return motor.getCurrentPosition()/ticksPerRotation;

    }
    public String getCurrentAmps(CurrentUnit Milliamps) {
        return getCurrentAmps(CurrentUnit.MILLIAMPS);
    }


    }
