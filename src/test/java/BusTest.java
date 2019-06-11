import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {
    Bus bus;
    Passenger passenger;

    @Before
    public void before(){
        bus = new Bus("Miami", 10);
        passenger = new Passenger();

    }
    @Test
    public void canCountPassengersEmptyBus(){
        assertEquals(0, bus.passengerCount());
    }

    @Test
    public void canAddPassenger(){
        bus.addPassenger(passenger);
        assertEquals(1, bus.passengerCount());
    }

    @Test
    public void cantAddPassenger(){
        bus.addPassenger(passenger);
        bus.addPassenger(passenger);
        bus.addPassenger(passenger);
        bus.addPassenger(passenger);
        bus.addPassenger(passenger);
        bus.addPassenger(passenger);
        bus.addPassenger(passenger);
        bus.addPassenger(passenger);
        bus.addPassenger(passenger);
        bus.addPassenger(passenger);
        bus.addPassenger(passenger);
        assertEquals(10, bus.passengerCount());
    }

    @Test
    public void canRemoverPassenger(){
        bus.addPassenger(passenger);
        bus.removePassenger();
        assertEquals(0, bus.passengerCount());
    }
}
