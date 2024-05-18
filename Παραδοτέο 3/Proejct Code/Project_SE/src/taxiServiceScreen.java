public class taxiServiceScreen extends screen{

    //attributes
    public static int taxiStatus = 1;

    //constructor
    public taxiServiceScreen() {
    }

    //methods
    public void notifyTaxi() {}

    public void calcTaxi() {}

    public void showMisData() {}

    public void showRideDet() {}

    public void renotifyTaxi() {}

    public void showPayDataForm() {}

    public void checkPayDataForm() {}

    public void notifyBank() {}

    public void showWrongData() {}

    public void sendReceipt() {}

    public void showFail() { System.out.println("You failed to accept the transaction in time!"); }

    public void sendCode() {}

    //getters and setters

    public static int getTaxiStatus() {
        return taxiStatus;
    }

    public static void setTaxiStatus(int taxiStatus) {
        taxiServiceScreen.taxiStatus = taxiStatus;
    }
}
