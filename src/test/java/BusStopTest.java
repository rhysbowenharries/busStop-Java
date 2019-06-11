import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusStopTest {

    BusStop busStop;
    Passenger passenger;

    @Before
    public void before(){
        busStop = new BusStop("Stop 1");
        passenger = new Passenger();

    }

    @Test
    public void queueStartsEmpty(){
        assertEquals(0, busStop.queueCounter());
    }

    @Test
    public void canAddToQueue(){
        busStop.addToQueue(passenger);
        assertEquals(1, busStop.queueCounter());

    }

    @Test
    public void canRemoveFromQueue(){
        busStop.addToQueue(passenger);
        busStop.removeFromQueue();
        assertEquals(0,busStop.queueCounter());
    }


}
