package patterns.builder.vehiculeTypes;

import patterns.builder.Vehicule;
import patterns.builder.VehiculeBuilder;

/**
 * Created by Ghazi Ennacer on 16/04/2017.
 */
public class Car implements VehiculeBuilder {

    Vehicule vehicule = new Vehicule("Car");

    public Car() {
    }

    @Override
    public void createCarcass() {
        vehicule.setCarcass("The carcass of the car.");
    }

    @Override
    public void createForce() {
        vehicule.setForce("The power of the car.");
    }

    @Override
    public void createEngine() {
        vehicule.setEngine("The engine of the car.");
    }

    @Override
    public void createBreaks() {
        vehicule.setBreaks("The breaks of the car.");
    }

    @Override
    public void createSeats() {
        vehicule.setSeats("The seats of the car.");
    }

    @Override
    public void createWindows() {
        vehicule.setWindows("The windows of the car.");
    }

    @Override
    public void createFuel() {
        vehicule.setFuel("The fuel of the car.");
    }

    @Override
    public Vehicule getVehicule() {
        return vehicule;
    }


}
