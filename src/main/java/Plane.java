import java.util.ArrayList;

public class Plane {
    private PlaneType planeType;
    private String airline;
    private ArrayList<String> passengers;

    public Plane(PlaneType planeType, String airline) {
        this.planeType = planeType;
        this.airline = airline;
        this.passengers = new ArrayList<>();
    }

    public PlaneType getPlaneType() {
        return planeType;
    }

    public String getAirline() {
        return airline;
    }

    public void addPassenger(ArrayList <Passenger> passenger) {
        this.passengers.add(passenger);
    }

    public int getPassengers() {
        this.passengers.size();
    }

}