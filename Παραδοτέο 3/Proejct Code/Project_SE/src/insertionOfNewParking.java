public class insertionOfNewParking extends screen{
    //attributes

    //constructor
    public insertionOfNewParking() {
    }

    //methods
    public void checkDataForm() { System.out.println("Processing Data"); }

    public void privateOrPublicParking() {
        System.out.println("Choose between private or public parking:");
    }

    public void showMisData() { System.out.println("Show missing data of data form:"); }

    public void showWrongData() { System.out.println("Show wrong data of data form:"); }

    public void showPayWayForm() { System.out.println("Pay Way form"); }

    public void subscriptionForm() { System.out.println("Subscription form"); }

    public void notifyMunicipalEmployee() { System.out.println("Notify municipal employee about insertion request"); }

    public void nonAcceptanceInform() {
        System.out.println("Parking was not accepted by municipal employee.");
    }

    public void showPayDataForm() { System.out.println("Pay Data form"); }

    public void checkPayDataForm() { System.out.println("Processing Payment Data"); }

    public void notifyBank() { System.out.println("Notify bank about transaction");}

    public void insertIntoTheDbase() { System.out.println("Insertion into database"); }

    public void successfulInsertion() {
        System.out.println("Parking was successfully inserted in the Database.");
    }

    public void showFail() {
        System.out.println("You failed to accept the transaction in time!");
    }

    //getters and setters
}
