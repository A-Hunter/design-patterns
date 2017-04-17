package patterns.builder;

import patterns.builder.vehiculeTypes.Bus;
import patterns.builder.vehiculeTypes.Car;
import patterns.builder.vehiculeTypes.Motocycle;

/**
 * Created by Ghazi Ennacer on 16/04/2017.
 */
public class VehiculeBuilderTest {

    public static void main(String[] args) {
        VehiculeBuilder car = new Car();
        VehiculeBuilderImpl impl = new VehiculeBuilderImpl(car);
        impl.build();
        Vehicule vehicule = car.getVehicule();
        System.out.println(vehicule);
        /////////////////////////
        VehiculeBuilder bus = new Bus();
        VehiculeBuilderImpl implBus = new VehiculeBuilderImpl(bus);
        implBus.build();
        Vehicule vehicule2 = bus.getVehicule();
        System.out.println(vehicule2);
        /////////////////////////
        VehiculeBuilder motocycle = new Motocycle();
        VehiculeBuilderImpl implMotocycle = new VehiculeBuilderImpl(motocycle);
        implMotocycle.build();
        Vehicule vehicule3 = motocycle.getVehicule();
        System.out.println(vehicule3);
    }

}
