public class ICS111Assignment04 {
    public static void main(String[] args){
        //Declaring variables and test cases
        double pizzaLarge;
        double pizzaSmall;
        double aliceBucks;
        double bobBucks;
        boolean aliceHasCard;
        boolean bobHasCard;

        pizzaLarge = 14.99;
        pizzaSmall = 10.99;
        aliceBucks = 25.00;
        bobBucks = 25.00;
        aliceHasCard = true;
        bobHasCard = true;
               

        //Check to see if any of the possible cases for buying a large pizza are true using the 'or' conditionals ||
        if (aliceBucks >= pizzaLarge / 2 && bobBucks >= pizzaLarge / 2 || aliceBucks >= pizzaLarge / 2 && bobHasCard || bobBucks >= pizzaLarge / 2 && aliceHasCard || bobHasCard && aliceHasCard){
            
            //If any are true then they will buy a large pizza, so I print it here to avoid having to put in every other condition
            System.out.println("They will buy the large pizza");
            
            //Checking if they have enough cash first since they prefer to use cash over card
            //Print results using printf() to format cash left
            if (aliceBucks >= pizzaLarge / 2 && bobBucks >= pizzaLarge / 2){
             
            //Reassigning values to variables based on amount they paid on half the pizza
                aliceBucks -= pizzaLarge / 2;
                bobBucks -= pizzaLarge / 2;

            //Print results using printf() to format cash left to two decimal places
                System.out.printf("Alice now has $%.2f left in cash.\n", aliceBucks);
                System.out.printf("Bob now has $%.2f left in cash.\n", bobBucks);

            //return to stop program from continuing
                return;
           }

            //Check to see if either has enough money to pay for half and the other can use card
            //Reassign values for person with enough cash
            //Print result of who used cash, how much they have left, and who used card
            //Return to stop program
           if (aliceBucks >= pizzaLarge / 2 && bobHasCard){
                aliceBucks -= pizzaLarge / 2;
                System.out.printf("Alice now has $%.2f left in cash.\n", aliceBucks);
                System.out.println(("Bob used card."));
                return;
           }
           if (bobBucks >= pizzaLarge / 2 && aliceHasCard){
                System.out.println("Alice used card.");
                bobBucks -= pizzaLarge / 2;
                System.out.printf("Bob now has $%.2f left in cash.\n", bobBucks);
                return;
           }

           //Check to see if they both have cards to use to buy a large pizza
           //Print result and return to stop program
           if (bobHasCard && aliceHasCard){
                System.out.println(("Alice used card."));
                System.out.println("Bob used card");
                return;
           }
        }

        //Everything same as above except using variable smallPizza instead of largePizza for prices
        if (aliceBucks >= pizzaSmall / 2 && bobBucks >= pizzaSmall / 2 || aliceBucks >= pizzaSmall / 2 && bobHasCard || bobBucks >= pizzaSmall / 2 && aliceHasCard){
            System.out.println("They will buy the small pizza");

            if (aliceBucks >= pizzaSmall / 2 && bobBucks >= pizzaSmall / 2){
                aliceBucks -= pizzaSmall / 2;
                System.out.printf("Alice now has $%.2f left in cash.\n", aliceBucks);
                bobBucks -= pizzaSmall / 2;
                System.out.printf("Bob now has $%.2f left in cash.\n", bobBucks);
                return;
           }
           if (aliceBucks >= pizzaSmall / 2 && bobHasCard){
                aliceBucks -= pizzaSmall / 2;
                System.out.printf("Alice now has $%.2f left in cash.\n", aliceBucks);
                System.out.println(("Bob used card."));
                return;
           }
           if (bobBucks >= pizzaSmall / 2 && aliceHasCard){
                System.out.println("Alice used card.");
                bobBucks -= pizzaSmall / 2;
                System.out.printf("Bob now has $%.2f left in cash.\n", bobBucks);
                return;
           }
        }

        //Final statement if eveything else was false
        //Print result that they cannot buy a pizza
        System.out.println("Too bad. They cannot buy a pizza.");
    }
}