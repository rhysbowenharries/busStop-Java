import java.util.ArrayList;

public class Bus {

    private String destination;
    private int capacity;
    private ArrayList<Passenger> passengers;

    public Bus(String destination, int capacity){
        this.destination = destination;
        this.capacity = capacity;
        this.passengers = new ArrayList<Passenger>();
    }


    public int passengerCount() {
        return this.passengers.size();
    }

    public void addPassenger(BusStop busStop) {
        if (this.passengers.size() < this.capacity) {
            Passenger passenger = busStop.removeFromQueue();
            this.passengers.add(passenger);
        }
    }

    public void removePassenger() {
        this.passengers.remove(0);
    }
}
