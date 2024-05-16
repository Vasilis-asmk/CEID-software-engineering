public class parkingRentScreen extends screen{
    //attributes
    public static int rentStatus = 1;

    //constructor
    public parkingRentScreen() {
    }

    //methods
    public void chooseParkingType() { System.out.println("Choose between private or public parking:"); }

    public void privateParking() { System.out.println("Private parking in the area you declared:"); }

    public void publicParking() { System.out.println("Public parking in the area you declared:"); }

    public void showDataForm() { System.out.println("Fill in your data: "); }

    public void notifyMunicipalEmployee() {}

    public void acceptInform() { System.out.println("Parking renting was accepted!"); }

    public void dataAndPayWayForm() { System.out.println("Data and Pay Way form"); }

    public void unavailableParking() {
        System.out.println("There is no available space in the specific parking lot! Select another parking lot:");
    }

    public void checkDataPayWayForm() {}

    public void notifyParking() {}

    public void showMisData() { System.out.println("The are missing fields!"); }

    public void rejInform() {
        System.out.println("Parking renting was not accepted by parking employee! Select another parking lot:");
    }

    public void showPayDataForm() { System.out.println("Pay Data form"); }

    public void checkPayDataForm() {}

    public void notifyBank() {}

    public void showWrongData() {}

    public void successfulRenting() { System.out.println("Parking renting was accepted!"); }

    public void showFail() { System.out.println("You failed to accept the transaction in time!"); }

    //getters and setters

}
