package patterns.builder;

import patterns.builder.vehiculeTypes.Bus;
import patterns.builder.vehiculeTypes.Car;
import patterns.builder.vehiculeTypes.Motocycle;

/**
 * Created by Ghazi Ennacer on 16/04/2017.
 */
public class VehiculeBuilderTest {

    public static void main(String[] args) {
        Vehicule car = new Car();
        VehiculeBuilderImpl impl = new VehiculeBuilderImpl(car);
        impl.build();
        VehiculeParts vehicule = car.getVehicule();
        System.out.println(vehicule);
        /////////////////////////
        Vehicule bus = new Bus();
        VehiculeBuilderImpl implBus = new VehiculeBuilderImpl(bus);
        implBus.build();
        VehiculeParts vehicule2 = bus.getVehicule();
        System.out.println(vehicule2);
        /////////////////////////
        Vehicule motocycle = new Motocycle();
        VehiculeBuilderImpl implMotocycle = new VehiculeBuilderImpl(motocycle);
        implMotocycle.build();
        VehiculeParts vehicule3 = motocycle.getVehicule();
        System.out.println(vehicule3);
    }

}
