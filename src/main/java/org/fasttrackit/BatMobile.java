package org.fasttrackit;

public class BatMobile extends Vehicle {
    @Override
    public double accelerate(double speed, double durationInHours) {
            System.out.println(getName() + " is accelerating with " + speed + " km/h for " + durationInHours + "h.");

            double distance = speed * durationInHours * 2;
            System.out.println("Traveled " + distance + " km. Cheater!");

            //        traveledDistance = traveledDistance + distance;
            //same result as above statement
            setTraveledDistance(getTraveledDistance() + distance);

            //logs
            System.out.println("Total traveled distance " + getTraveledDistance() + " km");


//        fuelLevel = fuelLevel - spentFuel;
            //same as above


        return distance;
        }
    }
