public class ICS111Assignment06 {
    public static void main(String[] args){

        double largePizza = 34.22;
        double smallPizza = 24.66;

        String outcome;
        String[]data = new String[]{};
        String[] test = 
            {

            "Alice,17.11,Bob,17.11,large,Just enough for a large",
            
            "Carol,25,Deidra,35,large,More than enough for a large",
            
            "Elon,17.11,Francisco,17.10,small,One person is short a penny for a large",
            
            "Greg,16,Hansen,15,small,More than enough for a small but not enough for a large",
            
            "Iris,12.33,Juan,12.33,small,Just enough for a small",
            
            "Kalani,5,Marilou,5,none,Neither person has enough for a pizza",
            
            "Napualani,19.05,Omar,12.32,none,One person is short a penny for a small",
            
            "Patricia,5,Robin,35,none,One person can not pay half but the other can pay for a large"
            
            };
            

        //Loop to go through all the test cases
        for (int i = 0; i < test.length; i++)
        {
            //Splits each part of the String in the test array into separate data array
            data = test[i].split(",");

            //Print outs first 3 preliminary lines using new data array from comma split values
            System.out.println("Test " + (i + 1) + ": " + data[5]);
            System.out.print(data[0] + " has $" + data[1] + ". ");
            System.out.println(data[2] + " has $" + data[3] + ".");

            //Checks what pizza the two can buy using the canBuy method
            if (canBuy(Double.parseDouble(data[1]), Double.parseDouble(data[3]), largePizza)){
                outcome = "large";
            }else if(canBuy(Double.parseDouble(data[1]), Double.parseDouble(data[3]), smallPizza)){
                outcome = "small";
            }else{
                outcome = "none";
            }
            

            //Testing Outcome
            //tests if the final outcome is the same as the expected outcome
            System.out.println("Expected: " + data[4] + " Observed: " + outcome);
            if (outcomeTest(data[4], outcome)){
            System.out.println("Pass");
            }else{
            System.out.println("Fail");
            }
            System.out.println();
        }
    }
    
        //Methods


        //CanBuy
        //takes the balances of the two people and returns true if they each have enough to pay for half, false if not
        public static boolean canBuy(double balance1, double balance2, double pizzaCost){
            return (balance1 >= pizzaCost / 2) && (balance2 >= pizzaCost/ 2);
        }

        //OutcomeTest
        //returns whether the actual outcome is the same as the expected 
        public static boolean outcomeTest(String expected, String observed){
            return expected.equals(observed);
        }
}