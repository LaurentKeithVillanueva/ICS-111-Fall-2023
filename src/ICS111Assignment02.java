public class ICS111Assignment02{
    public static void main(String[] args){
        //Create variables for given Strings
        String bob = "Bob";
        String cat = "cat";
        String gold = "Gold";
        String fish = "fish";
        
        /*
        Use concat method to merge the String variables created above
        For catfish, capitaliza the first letter of cat using the substring method to take the first letter
        and the toUpperCase method to capitalize it
        */
        String goldFish1 = gold.concat(fish);
        String catFish = cat.substring(0, 1).toUpperCase() + cat.substring(1) + fish;
        String goldFish2 = gold.concat(fish);
        String bobCat = bob.concat(cat);
        
        //Print the concatenated String variables and print their length using the length method
        System.out.println("Goldfish has: " + goldFish1.length() + " characters.");
        System.out.println("Catfish has: " + catFish.length() + " characters.");
        System.out.println("Goldfish has: " + goldFish2.length() + " characters.");
        System.out.println("Bobcat has: " + bobCat.length() + " characters. \n");
        
        //Check the ending of strings by using the  smaller word and comparing that to the bigger word using substring
        System.out.println("Goldfish ends with 'fish'? " + goldFish1.substring(goldFish1.length() - fish.length()).equals(fish));
        System.out.println("Bobcat ends with 'fish'? "  + bobCat.substring(bobCat.length() - fish.length()).equals(fish));

        //Check if words are the same using the equals method
        System.out.println("Goldfish and Goldfish are the same? " + goldFish1.equals(goldFish2));
        System.out.println("Goldfish and Catfish are the same? " + goldFish1.equals(catFish) + "\n");

        //Creating a new String object and using the replaceFirst method to change Bobcat to Tomcat
        String tomCat = bobCat.replaceFirst("Bob", "Tom");

        //Print result
        System.out.println("My first cat is: " + bobCat);
        System.out.println("My second cat is: " + tomCat);

    }
}