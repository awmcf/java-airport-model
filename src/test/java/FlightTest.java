import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Plane plane;
    Flight flight;

    @Before
    public void before(){
        plane = new Plane(PlaneType.SMALL, "Air Asia");
        flight = new Flight(plane, "AA1212", "Kuala Lumpur");
    }

    @Test
    public void hasPlane() {
        assertEquals(plane, flight.getPlane());
    }

    @Test
    public void hasFlightNumber() {
        assertEquals("AA1212", flight.getFlightNumber());
    }

    @Test
    public void hasDestination() {
        assertEquals("Kuala Lumpur", flight.getDestination());
    }
}