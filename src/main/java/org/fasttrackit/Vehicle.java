package org.fasttrackit;

import java.time.LocalDate;

public class Vehicle {




    String name;
    double mileage;
    String color;
    double maxSpeed;
    boolean running;
    double fuelLevel;
    double traveledDistance;
    LocalDate createdDate;


    public double accelerate(double speed, double durationInHours) {
        System.out.println(name + " is accelerating with " + speed + " km/h for " + durationInHours + "h.");
        double distance = speed * durationInHours;
        System.out.println("Traveled " + distance + " km.");
//        traveledDistance = traveledDistance + distance;
        //same result as above statement
        traveledDistance += distance;
        //logs
        System.out.println("Total traveled distance " + traveledDistance + " km");
        double spentFuel = distance / 100 * mileage;

        System.out.println("spent Fuel: " + spentFuel + "1.");
//        fuelLevel = fuelLevel - spentFuel;
        //same as above
        fuelLevel -= spentFuel;
        System.out.println("Remaining fuel" + fuelLevel + "1.");
        return distance;

    }



}

