package patterns.builder;

/**
 * Created by Ghazi Ennacer on 16/04/2017.
 */
class VehiculeBuilderImpl {

    private Vehicule vehiculeBuilder;

    VehiculeBuilderImpl(Vehicule vehiculeBuilder){

        this.vehiculeBuilder = vehiculeBuilder;
    }

    void build(){
        vehiculeBuilder.createCarcass();
        vehiculeBuilder.createForce();
        vehiculeBuilder.createEngine();
        vehiculeBuilder.createBreaks();
        vehiculeBuilder.createSeats();
        vehiculeBuilder.createWindows();
        vehiculeBuilder.createFuel();
    }
}
