import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;

public class ICS111Assignment07 {
    public static void main(String[] args)throws Exception{
        //creating variable to store path of text file
        File inFile = new File("pizzaTestsIn.txt");
        PrintWriter outFile = new PrintWriter("pizzaTestsOut.txt");
        Scanner scan = new Scanner(inFile);

        //array lists to store data from the input file
        ArrayList<String> testCases = new ArrayList<String>();
        ArrayList<Double> balances = new ArrayList<Double>();
        ArrayList<String> names = new ArrayList<String>();

        String[] data = new String[6];
        String line = "";

        //costs of pizza
        double largePizza = 34.22;
        double smallPizza = 24.66;

        String outcome;
        int lineNumber = 1;

        //continues until there are no more lines in the input file
        while (scan.hasNextLine()){
            //take each line of the text file and split into data array
            line  = scan.nextLine();
            data = line.split(",");

            //add the information from the line to the appropriate ArrayList
            testCases.add(0, data[4]);
            testCases.add(1, data[5]);
            balances.add(0, Double.parseDouble(data[1]));
            balances.add(1, Double.parseDouble(data[3]));
            names.add(0, data[0]);
            names.add(1, data[2]);

            //prints the preliminary information taken from the text file
            outFile.println("Test " + (lineNumber++) + ": " + testCases.get(1));
            outFile.printf(names.get(0) + " has $%.2f. ", balances.get(0));
            outFile.printf(names.get(1) + " has $%.2f.\n", balances.get(1)); 
            
            //checks to see what type of pizza the two can buy using the canBuy() method
            if (canBuy(balances.get(0), balances.get(1), largePizza)){
                outcome = "large";
            }else if(canBuy(balances.get(0), balances.get(1), smallPizza)){
                outcome = "small";
            }else{
                outcome = "none";
            }

            //prints out results of the test to the outfile
            outFile.println("Expected: " + testCases.get(0) + " Observed: " + outcome);
            if (outcomeTest(testCases.get(0), outcome)){
            outFile.println("Pass");
            }else{
            outFile.println("Fail");
            }
            outFile.println();
        }

        scan.close();
        outFile.close();
    }

    //canBuy
    //checks to see if both people have more than or equal to half the cost of the pizza
    public static boolean canBuy(double balance1, double balance2, double pizzaCost){
            return (balance1 >= pizzaCost / 2) && (balance2 >= pizzaCost/ 2);
    }

    //outcomeTest
    //returns whether the actual outcome is the same as the expected 
    public static boolean outcomeTest(String expected, String observed){
        return expected.equals(observed);

    }
}
