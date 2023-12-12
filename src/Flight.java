abstract class Flight {

    //Instance variables
    //protected to allow subclass access
    protected int flightNumber;
    protected String origin;
    protected String destination;

    public Flight(int f, String orig, String dest){
        this.flightNumber = f;
        this.origin = orig;
        this.destination = dest;
    }

    //Getter for flightNumber instance variable
    public int getFlightNumber(){
        return flightNumber;
    }

    //Similar to toString/flightManifest from last assignment
    //returns organized flight plan with its flightNumber, origin, and destination
    public String getFlightPlan(){
        return "Flight " + flightNumber + ": " + origin + " to " + destination; 
    }

    /*
    private final int CAPACITY = 6;
    private int flightNumber;
    private ArrayList<Passenger> passengers = new ArrayList<Passenger>();


    //Constructor
    public Flight(int f){
        flightNumber = f;
    }

    //Getter
    public int getFlightNumber(){
        return flightNumber;
    }

    //Checks to see if there is space and adds the person if there is, returning true
    public boolean addPassenger(Passenger name){
        boolean isAdded = false;
        if (passengers.size() < CAPACITY){
            passengers.add(name);
            isAdded = true;
        }
        return isAdded;
    }

    //Removes name of passenger given from the ArrayList of passengers of the flight. return true if the name was present, false if not
    public boolean cancelPassenger(Passenger name){
        return  passengers.remove(name);
    }

    //returns string with formatted output of flight number, number of passengers and passengers on flight
    public String getPassengerManifest(){
        String line = "Flight: " + flightNumber + "\n" + passengers.size() + " passengers\n" + printPassengers();
        return line;
    }

    //Method to format and return passengers in brackets
    //iterates through arraylist of passengers and adds each with correct formatting
    public String printPassengers(){
        String passes = "";
        if (!passengers.isEmpty()){
            for (int i = 0; i < passengers.size(); i++){
                passes += passengers.get(i) + "\n";
            }
        }
        
        return passes;
    }
    */
}
