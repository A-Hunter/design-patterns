package patterns.builder.vehiculeTypes;

import patterns.builder.VehiculeParts;
import patterns.builder.Vehicule;

/**
 * Created by Ghazi Ennacer on 16/04/2017.
 */
public class Bus implements Vehicule {

    VehiculeParts bus = new VehiculeParts("Bus");

    public Bus() {
    }

    @Override
    public void createCarcass() {
        bus.setCarcass("The carcass of the bus.");
    }

    @Override
    public void createForce() {
        bus.setForce("The power of the bus.");
    }

    @Override
    public void createEngine() {
        bus.setEngine("The engine of the bus.");
    }

    @Override
    public void createBreaks() {
        bus.setBreaks("The breaks of the bus.");
    }

    @Override
    public void createSeats() {
        bus.setSeats("The seats of the bus.");
    }

    @Override
    public void createWindows() {
        bus.setWindows("The windows of the bus.");
    }

    @Override
    public void createFuel() {
        bus.setFuel("The fuel of the bus.");
    }

    @Override
    public VehiculeParts getVehicule() {
        return bus;
    }
}
