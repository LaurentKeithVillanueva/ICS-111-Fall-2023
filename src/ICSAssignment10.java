import java.util.ArrayList;
import java.io.File;
import java.util.Scanner;

public class ICSAssignment10 {
    public static void main(String[] args)throws Exception
    {
        ArrayList<Flight> flights = new ArrayList<Flight>();

        flights.add(new PassengerFlight(356,"HNL","SFO"));
        flights.add(new PassengerFlight(357,"SFO","SLC"));
        flights.add(new CargoFlight(412,"DEN","EWR"));
        flights.add(new CargoFlight(413,"RDW","HOU"));
        flights.add(new MilitaryFlight(9612,"ADW","EDW"));
        flights.add(new MilitaryFlight(9815,"HNL","LFI"));

        File inFile = new File("flights.txt");
        Scanner input = new Scanner(inFile);
        int flightNumber;
        boolean found;

        while(input.hasNextLine()){
            try
            {
                flightNumber = Integer.parseInt(input.nextLine());
                found = false;
                for (int i = 0; i < flights.size(); i++)
                {
                    if (flights.get(i).getFlightNumber() == flightNumber)
                    {
                        System.out.println(flights.get(i).getFlightPlan());
                        found = true;
                    }
                }
                if (!found)
                {
                    System.out.println("Flight " + flightNumber + ": not found.");
                }  
            }
            catch (NumberFormatException e) 
            {
                System.out.println("Corrupt data: Not an integer");
            }
        }
        input.close();
    }
}
