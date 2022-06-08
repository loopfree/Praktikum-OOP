// Steven
// 13520131
// Minggu 10: Praktikum 3

import java.lang.*;
import java.io.*;

class Car extends MotorizedVehicle implements Rideable, NeedFuel 
{
    public Car() {
        name = "Car";
        fuel = 5;
    }

    public Car(String name, int fuel) {
        this.name = name;
        this.fuel = fuel;
    }

    public void ride() {
        if(this.fuel == 0) {
            System.out.println("No fuel, cannot ride");
            return;
        }
        System.out.println("Riding a " + getName() + ", fuel remaining: " + --this.fuel);
    }

    public void fillFuel(int amount) {
        this.fuel += amount;
        System.out.println("Filled " + amount + " units of fuel, fuel now: " + this.fuel);
    }
    
    public String getName() {
        return name;
    }

    public int getFuel() {
        return fuel;
    }
}