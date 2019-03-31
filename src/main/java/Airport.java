import java.util.ArrayList;

public class Airport {
    private ArrayList<Plane> hangars;
    private String airportCode;

    public Airport(String airportCode) {
        this.airportCode = airportCode;
        this.hangars = new ArrayList<>();
    }

    public String getAirportCode() {
        return airportCode;
    }

    public void addPlaneToHangar(Plane plane) {
        this.hangars.add(plane);
    }

    public void removePlaneFromHangar(Plane plane) {
        this.hangars.remove(plane);
    }


    public int hangarCount() {
        return this.hangars.size();
    }

    public int flightsCount() {
        return 3 - this.hangars.size();
    }

    public void createFlight(Plane plane) {
        this.removePlaneFromHangar(plane);
    }

}