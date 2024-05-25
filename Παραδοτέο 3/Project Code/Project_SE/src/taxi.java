public class taxi extends user{


    //attributes
    private int taxiId;
    private String name;
    private String surname;


    //methods
    public void rideAccept() {
        System.out.println("Driver accepted the ride.");
    }

    public void notAccept() {
        System.out.println("Drive rejected the ride");
    }


    //getters and setters
    public int getTaxiId() {
        return taxiId;
    }


    // getters and setters
    public void setTaxiId(int taxiId) {
        this.taxiId = taxiId;
    }
}
