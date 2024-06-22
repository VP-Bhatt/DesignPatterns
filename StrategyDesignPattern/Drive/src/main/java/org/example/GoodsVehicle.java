package org.example;

import org.example.driceStrateggy.DriveStrategy;
import org.example.driceStrateggy.NormalDrive;

public class GoodsVehicle extends Vehicle{
    GoodsVehicle(){
        super (new NormalDrive());
    }
}
