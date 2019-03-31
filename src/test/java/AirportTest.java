import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class AirportTest {
    Plane plane1;
    Plane plane2;
    Plane plane3;

    Flight flight1;
    Flight flight2;
    Flight flight3;

    Passenger passenger1;
    Passenger passenger2;
    Passenger passenger3;
    ArrayList<Passenger> passengers;

    Airport edinburghAirport;

    @Before
    public void before(){
        plane1 = new Plane(PlaneType.LARGE, "Ryan Air");
        plane2 = new Plane(PlaneType.MEDIUM, "Air Emirates");
        plane3 = new Plane(PlaneType.SMALL, "United Airlines");

        flight1 = new Flight(plane1, "RY21", "Dublin");
        flight2 = new Flight(plane2, "AE333", "Mumbai");
        flight3 = new Flight(plane3, "UA123", "Portland");

        passenger1 = new Passenger("Aaron", "Irish");
        passenger2 = new Passenger("Oliver", "Canadian");
        passenger3 = new Passenger("Colvin", "American");
        passengers = new ArrayList<>();
        passengers.add(passenger1);
        passengers.add(passenger2);
        passengers.add(passenger3);

        edinburghAirport = new Airport("EDI");
        edinburghAirport.addPlaneToHangar(plane1);
        edinburghAirport.addPlaneToHangar(plane2);
        edinburghAirport.addPlaneToHangar(plane3);

    }

    @Test
    public void hasAirportCode() {
        assertEquals("EDI", edinburghAirport.getAirportCode());
    }

    @Test
    public void canAddPlaneToHangar() {
        assertEquals(3, edinburghAirport.hangarCount());
    }

    @Test
    public void canRemovePlaneFromHangar() {
        edinburghAirport.removePlaneFromHangar(plane1);
        assertEquals(2, edinburghAirport.hangarCount());
    }

    @Test
    public void canCreateFlight() {
        edinburghAirport.createFlight(plane1);
        assertEquals(2, edinburghAirport.hangarCount());
        assertEquals(1, edinburghAirport.flightsCount());
    }

    @Test
    public void canSellTicketForFlight(Passenger passenger1) {
        edinburghAirport.removePlaneFromHangar(plane1);
        plane1.addPassenger(passenger1);
        assertEquals(1, plane1.getPassengers.);
    }

}