public class ICS111Assignment03 {
    public static void main(String[] args){
        //Create the String varaibles for printing later
        String bobBuy;
        String aliceBuy;

        //Assign the given values of the diameter and width to double variables
        double thinCrustDia = 17;
        double thickCrustDia = 14;

        double thinCrustWid = 1.2;
        double thickCrustWid = 2;

        //Calculate the circumfrence of each pizza using the given diameter value and Math class's PI value
        double thinCrustCirc = thinCrustDia * Math.PI;
        double thickCrustCirc = thickCrustDia * Math.PI;

        /*
        Calculate the volume of each pizza with the formula for volume of a cylinder
        using given width and diameter values.
        Converted width in cm to inches by dividing by 2.54
        */
        double thinCrustVol = Math.pow(thinCrustDia/2, 2) * (thinCrustWid / 2.54) * Math.PI;
        double thickCrustVol = Math.pow(thickCrustDia/2, 2) * (thickCrustWid / 2.54) * Math.PI;

        //Assign the correct String literal to the String variables created earlier.
        //Choose correct String using '?' conditional operator
        bobBuy = thinCrustCirc > thickCrustCirc ? "Bob will buy the 17-inch pizza." : "Bob will buy the 14-inch pizza.";
        aliceBuy = thinCrustVol > thickCrustVol ? "Alice will buy the 17-inch pizza." : "Alice will buy the 14-inch pizza.";

        //Print results
        System.out.printf("The volume of the 17-inch pizza is %.2f inches cubed. \n", + thinCrustVol);
        System.out.printf("The volume of the 14-inch pizza is %.2f inches cubed. \n\n", + thickCrustVol);
        
        System.out.println(bobBuy);
        System.out.print(aliceBuy);
    }
}
