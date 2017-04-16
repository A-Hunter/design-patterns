package patterns.builder;

/**
 * Created by Ghazi Ennacer on 16/04/2017.
 */
public interface VehiculeBuilder {

    public void createCarcass();
    public void createForce();
    public void createEngine();
    public void createBreaks();
    public void createSeats();
    public void createWindows();
    public void createFuel();
    public Vehicule getVehicule();
}
