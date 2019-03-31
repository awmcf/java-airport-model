import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    Plane plane;
    Passenger passenger1;
    Passenger passenger2;
    Passenger passenger3;

    @Before
    public void before() {
        passenger1 = new Passenger("Aaron", "Irish");
        passenger2 = new Passenger("Charles", "Canadian");
        passenger3 = new Passenger("Songa", "South Korean");
        plane = new Plane(PlaneType.MEDIUM, "British Airways");
    }

    @Test
    public void hasPlaneType() {
        assertEquals(PlaneType.MEDIUM, plane.getPlaneType());
    }

    @Test
    public void hasAirline() {
        assertEquals("British Airways", plane.getAirline());
    }

    @Test
    public void canAddPassengerToFlight() {
        plane.addPassenger();
        assertEquals(1, plane.getPassengers());
    }

}