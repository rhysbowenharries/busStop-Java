import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {
    Bus bus;
    Passenger passenger;
    BusStop busStop;

    @Before
    public void before(){
        bus = new Bus("Miami", 10);
        passenger = new Passenger();
        busStop = new BusStop("stop 1");
        busStop.addToQueue(passenger);

    }
    @Test
    public void canCountPassengersEmptyBus(){
        assertEquals(0, bus.passengerCount());
    }

    @Test
    public void canAddPassenger(){
        bus.addPassenger(busStop);
        assertEquals(1, bus.passengerCount());
    }

    @Test
    public void cantAddPassenger(){
        busStop.addToQueue(passenger);
        busStop.addToQueue(passenger);
        busStop.addToQueue(passenger);
        busStop.addToQueue(passenger);
        busStop.addToQueue(passenger);
        busStop.addToQueue(passenger);
        busStop.addToQueue(passenger);
        busStop.addToQueue(passenger);
        busStop.addToQueue(passenger);
        busStop.addToQueue(passenger);
        busStop.addToQueue(passenger);
        busStop.addToQueue(passenger);
        busStop.addToQueue(passenger);
        busStop.addToQueue(passenger);
        busStop.addToQueue(passenger);
        busStop.addToQueue(passenger);
        busStop.addToQueue(passenger);
        busStop.addToQueue(passenger);
        busStop.addToQueue(passenger);
        busStop.addToQueue(passenger);
        bus.addPassenger(busStop);
        bus.addPassenger(busStop);
        bus.addPassenger(busStop);
        bus.addPassenger(busStop);
        bus.addPassenger(busStop);
        bus.addPassenger(busStop);
        bus.addPassenger(busStop);
        bus.addPassenger(busStop);
        bus.addPassenger(busStop);
        bus.addPassenger(busStop);
        bus.addPassenger(busStop);
        assertEquals(10, bus.passengerCount());
    }

    @Test
    public void canRemoverPassenger(){
        bus.addPassenger(busStop);
        bus.removePassenger();
        assertEquals(0, bus.passengerCount());
    }
}
