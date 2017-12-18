package patterns.builder;

/**
 * Created by Ghazi Ennacer on 16/04/2017.
 */
public interface Vehicule {

    void createCarcass();
    void createForce();
    void createEngine();
    void createBreaks();
    void createSeats();
    void createWindows();
    void createFuel();
    VehiculeParts getVehicule();
}
