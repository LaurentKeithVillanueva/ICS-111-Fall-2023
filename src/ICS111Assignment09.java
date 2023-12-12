import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;

public class ICS111Assignment09 {
    public static void main(String[] args)throws Exception{
        File inFile = new File("passengers1.csv");
        //File inFile = new File("passengers2.csv");
        Scanner scan = new Scanner(inFile);

        //ArrayList to store Passenger instances instead of String objects
        ArrayList<Passenger> passengers = new ArrayList<Passenger>();

        //create array to store split string
        String data[] = new String[]{};
        //skip header line
        scan.nextLine();

        //continue for whole length of file
        while (scan.hasNextLine()){
            data = scan.nextLine().split(",");
        //add new Passenger instance to ArrayList using split string from file as parameters
            passengers.add(new Passenger(data[0], Boolean.parseBoolean(data[1]), Integer.parseInt(data[2])));
        }

        Flight f473 = new Flight(473);
        Flight f474 = new Flight(474);
        
        //same logic from assignment 8
        //adding each passenger from the ArrayList to a flight if there is space
        for (Passenger p : passengers)
        {
            if (f473.addPassenger(p)){
                System.out.println(p + " was added to flight " + f473.getFlightNumber());
            }else if(f474.addPassenger(p)){
                System.out.println(p + "was added to flight " + f474.getFlightNumber());
            }else{
                System.out.println(p + " could not be booked on any flights.");
            }
        }

        System.out.println();
        //print out flight details with passengers after bookings
        System.out.println(f473.getPassengerManifest());
        System.out.println(f474.getPassengerManifest());

        //attempt to remove passenger from one flight and put onto another flight
        if (f473.cancelPassenger(passengers.get(2))){
            System.out.println(passengers.get(2) + " has cancelled flight " + f473.getFlightNumber());
        }
        if(f474.addPassenger(passengers.get(2))){
            System.out.println(passengers.get(2) + " is booked on flight " + f474.getFlightNumber());
        }else{
            System.out.println(passengers.get(2) + " could not be booked on flight " + f474.getFlightNumber());
        }

        System.out.println();
        //print out flight details with passengers after removal and new booking
        System.out.println(f473.getPassengerManifest());
        System.out.println(f474.getPassengerManifest());

        scan.close();
    }
}