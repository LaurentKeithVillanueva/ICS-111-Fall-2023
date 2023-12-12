public class Passenger {
    
    //initializing instance variables of passenger objects
    private String name;
    private boolean frequentFlyer;
    private String status;
    private int nMiles;

    //constructor 
    public Passenger(String n, boolean ff, int m){
        name = n;
        frequentFlyer = ff;
        nMiles = m;
        
        if(frequentFlyer){
            setStatus(nMiles);
        }else{
            status = "Not frequent flyer";
        }
    }

    //sets the status of the passenger based on miles flown provided
    public void setStatus(int m){
        if (m > 99999){
            status = "Gold";
        }else if (m > 50000){
            status = "Silver";
        }else if (m > 2500){
            status = "Bronze";
        }
        else{
            status = "Aspiring";
        }
    }

    //toString method to change what is printed when object is printed. includes name and flyer status
    public String toString(){
        return name + " (" + status + ")";
    }

}
