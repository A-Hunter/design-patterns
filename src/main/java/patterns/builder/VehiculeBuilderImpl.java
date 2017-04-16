package patterns.builder;

import patterns.builder.vehiculeTypes.Car;

/**
 * Created by Ghazi Ennacer on 16/04/2017.
 */
public class VehiculeBuilderImpl {

    private VehiculeBuilder vehiculeBuilder;

    public VehiculeBuilderImpl(VehiculeBuilder vehiculeBuilder){

        this.vehiculeBuilder = vehiculeBuilder;
    }

    public void build(){
        vehiculeBuilder.createCarcass();
        vehiculeBuilder.createForce();
        vehiculeBuilder.createEngine();
        vehiculeBuilder.createBreaks();
        vehiculeBuilder.createSeats();
        vehiculeBuilder.createWindows();
        vehiculeBuilder.createFuel();
    }
}
