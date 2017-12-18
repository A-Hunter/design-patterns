package patterns.builder;

/**
 * Created by Ghazi Ennacer on 16/04/2017.
 */
public class VehiculeParts {
    private String Carcass;
    private String force;
    private String engine;
    private String breaks;
    private String seats;
    private String windows;
    private String fuel;
    private String vehiculeModel;

    public VehiculeParts(final String vehiculeModel){
        this(null,null,null,null,null,null,null, vehiculeModel);
    }

    VehiculeParts(final String carcass, final String forse, final String engine,
                         final String breaks, final String seats, final String windows,
                         final String fuel, final String vehiculeModel) {
        Carcass = carcass;
        this.force = forse;
        this.engine = engine;
        this.breaks = breaks;
        this.seats = seats;
        this.windows = windows;
        this.fuel = fuel;
        this.vehiculeModel = vehiculeModel;
    }

    public void setCarcass(String carcass) {
        Carcass = carcass;
    }

    public void setForce(String force) {
        this.force = force;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void setBreaks(String breaks) {
        this.breaks = breaks;
    }

    public void setSeats(String seats) {
        this.seats = seats;
    }

    public void setWindows(String windows) {
        this.windows = windows;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public void setVehiculeModel(String vehiculeModel) {
        this.vehiculeModel = vehiculeModel;
    }

    @Override
    public String toString() {
        return "VehiculeParts{" +
                "Carcass='" + Carcass + '\'' +
                ", force='" + force + '\'' +
                ", engine='" + engine + '\'' +
                ", breaks='" + breaks + '\'' +
                ", seats='" + seats + '\'' +
                ", windows='" + windows + '\'' +
                ", fuel='" + fuel + '\'' +
                ", vehiculeModel='" + vehiculeModel + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        VehiculeParts vehicule = (VehiculeParts) o;

        if (!Carcass.equals(vehicule.Carcass)) return false;
        if (!force.equals(vehicule.force)) return false;
        if (!engine.equals(vehicule.engine)) return false;
        if (!breaks.equals(vehicule.breaks)) return false;
        if (!seats.equals(vehicule.seats)) return false;
        if (!windows.equals(vehicule.windows)) return false;
        if (!fuel.equals(vehicule.fuel)) return false;
        return vehiculeModel.equals(vehicule.vehiculeModel);
    }

    @Override
    public int hashCode() {
        int result = Carcass.hashCode();
        result = 31 * result + force.hashCode();
        result = 31 * result + engine.hashCode();
        result = 31 * result + breaks.hashCode();
        result = 31 * result + seats.hashCode();
        result = 31 * result + windows.hashCode();
        result = 31 * result + fuel.hashCode();
        result = 31 * result + vehiculeModel.hashCode();
        return result;
    }
}
