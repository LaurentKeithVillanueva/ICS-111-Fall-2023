public class MilitaryFlight extends Flight{

public MilitaryFlight(int f, String from, String to){
    super(f, from, to);
}

public String getFlightPlan(){
    return "Flight " + flightNumber + ": Restricted";
}
}
