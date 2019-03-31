import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger;

    @Before
    public void before(){
        passenger = new Passenger("Aaron", "Irish");
    }

    @Test
    public void hasName() {
        assertEquals("Aaron", passenger.getName());
    }

    @Test
    public void hasNationality() {
        assertEquals("Irish", passenger.getNationality());
    }
}