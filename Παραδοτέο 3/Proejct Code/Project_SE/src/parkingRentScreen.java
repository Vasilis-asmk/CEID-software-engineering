public class parkingRentScreen extends screen{
    //attributes

    //constructor
    public parkingRentScreen() {
    }

    //methods
    public void chooseParkingType() { System.out.println("Choose between private or public parking:"); }

    public void privateParking() {}

    public void publicParking() {}

    public void showDataForm() {}

    public void notifyMunicipalEmployee() {}

    public void acceptInform() { System.out.println("Parking renting was accepted!"); }

    public void dataAndPayWayForm() {}

    public void unavailableParking() {
        System.out.println("There is no available space in the specific parking lot! Select another parking lot:");
    }

    public void checkDataPayWayForm() {}

    public void notifyParking() {}

    public void showMisData() {}

    public void rejInform() {
        System.out.println("Parking renting was not accepted by parking employee! Select another parking lot:");
    }

    public void showPayDataForm() {}

    public void checkPayDataForm() {}

    public void notifyBank() {}

    public void showWrongData() {}

    public void successfulRenting() { System.out.println("Parking renting was accepted!"); }

    public void showFail() { System.out.println("You failed to accept the transaction in time!"); }

    //getters and setters

}
