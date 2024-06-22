package org.example;

import org.example.Vehicle;
import org.example.driceStrateggy.SportDrive;

public class SportsBike extends Vehicle {

    SportsBike(){
        super (new SportDrive());
    };
}
