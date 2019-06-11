import java.util.ArrayList;

public class BusStop {

    private String name;
    private ArrayList<Passenger> passengerQueue;

    public BusStop(String name){
        this.name = name;
        this.passengerQueue = new ArrayList<Passenger>();
    }

    public int queueCounter() {
        return this.passengerQueue.size();
    }

    public void addToQueue(Passenger passenger){
        this.passengerQueue.add(passenger);
    }

    public Passenger removeFromQueue(){
        return this.passengerQueue.remove(0);
    }
}
