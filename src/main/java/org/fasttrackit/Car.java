package org.fasttrackit;

// inheritance or "is-a" relationship
import  java.time.LocalDate;

public class Car extends AutoVehicle {


    int doorCount;




    LocalDate createdDate;


    public Car(Engine engine) {
        super(engine);

    }


}
