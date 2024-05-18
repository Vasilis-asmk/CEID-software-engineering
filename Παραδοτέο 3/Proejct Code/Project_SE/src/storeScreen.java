public class storeScreen extends screen {
    //attributes
    public static int storeStatus = 1;

    //constructor

    storeScreen() {
    }


    // methods

    public void showDataForm() {
        System.out.println("Fill in your transaction data: ");
    }

    public void checkData() {
        System.out.println("Processing Data");
    }

    public void showPayForm() {
        System.out.println("Fill in your payment data: ");
    }

    public void showMisData() { System.out.println("Show missing data of transaction form:"); }

    public void checkPayForm() { System.out.println("Processing Payment Data"); }

    public void notifyBank()  { System.out.println("Notify bank about transaction"); }

    public void showMisPayData() { System.out.println("Show missing data of payment form:"); }

    public void showWrongData() { System.out.println("Show wrong data of payment form:"); }

    public void showFail() {
        System.out.println("Transaction was not accepted on time. Therefore it was cancelled! ");
    }

    public void sendReceipt() {
        System.out.println("Payment was successfully accepted. Transaction receipt was sent via email.");
    }

    //getters and setters
    public static int getStoreStatus() {
        return storeStatus;
    }

    public static void setStoreStatus(int storeStatus) {
        storeScreen.storeStatus = storeStatus;
    }
}

