package patterns.builder.vehiculeTypes;

import patterns.builder.VehiculeParts;
import patterns.builder.Vehicule;

/**
 * Created by Ghazi Ennacer on 16/04/2017.
 */
public class Car implements Vehicule {

    VehiculeParts vehicule = new VehiculeParts("Car");

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
    public VehiculeParts getVehicule() {
        return vehicule;
    }


}
