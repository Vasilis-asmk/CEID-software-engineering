public class parkingEmp extends user{

    //attributes


    //constructor
    public parkingEmp() {
    }

    //methods
    public void rentAccept() {
        System.out.println("Parking space accepted!");
    }

    public void rentNotAccept() {
        System.out.println("Parking space not accepted");
    }

    public void insertionOfNewParking() {
        System.out.println("User selected the insertion of new parking page.");
    }

    public void selectPrivateParking() { System.out.println("Private Parking Selected"); }

    public void compPayWayForm() { System.out.println("User has filled in the pay way form"); }

    public void selectPublicParking() {  System.out.println("Public Parking Selected"); }

    public void compSubscriptionForm() {  System.out.println("User has filled in the subscription form"); }

    public void compPayDataForm() { System.out.println("User has filled in his payment data"); }

    public void acceptTrans() {
        System.out.println("Transaction Accepted!");
        insertionOfNewParking parking_insertion = new insertionOfNewParking();
        parking_insertion.insertIntoDbase();
    }

    public void compDataForm() { System.out.println("User has filled in the data"); }

    //getters and setters
}
