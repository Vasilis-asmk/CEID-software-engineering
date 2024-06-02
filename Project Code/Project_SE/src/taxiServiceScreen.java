public class taxiServiceScreen extends screen{

    //attributes
    public static int taxiStatus = 1;

    //constructor
    public taxiServiceScreen() {
    }

    //methods
    public void calcTaxi() {
        taxi taxiDriver1 = new taxi();
        System.out.println("Calculating closest driver.");
    }

    public void notifyTaxi() {
        System.out.println("Notification sent to chosen driver.");
    }

    public void showMisData() {
        System.out.println("Show missing data of data form:");
    }

    public void showRideDet() {
        System.out.println("Show details for selected ride");
    }

    public void renotifyTaxi() {
        System.out.println("Sending new notification to drivers on a larger area");
        taxi taxiDriver2 = new taxi();
    }

    public void showPayDataForm() {
        System.out.println("Pay Data form");
    }

    public void checkPayDataForm() {
        System.out.println("Processing Payment Data");
    }

    public void notifyBank() {
        System.out.println("Notify bank about transaction");
    }

    public void showWrongData() {
        System.out.println("Show wrong data of data form:");
    }

    public void sendReceipt() {
        System.out.println("Ride receipt has been sent via e-mail");
    }

    public void showFail() {
        System.out.println("You failed to accept the transaction in time!");
    }

    public void sendCode() {
        System.out.println("Confirmation code has been sent to both the client and the driver");
    }

    //getters and setters

    public static int getTaxiStatus() {
        return taxiStatus;
    }

    public static void setTaxiStatus(int taxiStatus) {
        taxiServiceScreen.taxiStatus = taxiStatus;
    }
}
