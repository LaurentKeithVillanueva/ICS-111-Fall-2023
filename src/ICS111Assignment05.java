public class ICS111Assignment05 
{
    public static void main(String[] args)
    {
        String[] customerName = new String[]{"Alice", "Bob", "Carol"};
        double[] customerBalance = new double[]{153.75, 104.60, 209.18};
        String[] data = new String[]{};
        String test = "Alice,Bob,5.06";

        //For loop to print balances of all people before transaction
        for (int  i = 0; i < customerName.length; i++)
        {
            System.out.printf(customerName[i] + " has $%.2f. ", customerBalance[i]);
        }
        
        System.out.println();
        data = test.split(",");
        //Algorithm to do transaction
        //for loop to parse through the names of the customers
        for (int i = 0; i < customerName.length; i++)
        {

            
            //if statement to find the giver's name equal to that in the request
            if (customerName[i].equals(data[0]))
            {
                //uses the index of the same name in the balance array in order to check if they have enough money tho give
                if (customerBalance[i] >= Double.parseDouble(data[2]))
                {
                    //uses same index to subtract from their account
                   customerBalance[i] -= Double.parseDouble(data[2]);
                }
                //else statement if they don't have enough money
                //prints they don't have enough money and reprints the balances then returns
                else
                {
                
                    System.out.println(customerName[i] + " doesn't have enough money for the transaction.");
                    for (int  o = 0; o < customerName.length; o++)
                    {
                        System.out.printf(customerName[o] + " has $%.2f. ", customerBalance[o]);
                    }
                    return;
                }
            }
        }
        for (int i = 0; i < customerName.length; i++)
        {
            //if statement to find the reciever's name equal to that in the request 
            if (customerName[i].equals(data[1]))
            {
                customerBalance[i] += Double.parseDouble(data[2]);
            }
        }

        //Print 2nd line
        System.out.printf(data[0] + " gave " + data[1] + " $%.2f.\n", Double.parseDouble(data[2]));
        
        //Print results at end with new balances after transaction
        for (int  i = 0; i < customerName.length; i++)
        {
            System.out.printf(customerName[i] + " has $%.2f. ", customerBalance[i]);
        }
                    
    }
}
