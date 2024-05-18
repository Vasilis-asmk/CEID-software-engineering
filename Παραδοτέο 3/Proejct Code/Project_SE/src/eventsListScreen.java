public class eventsListScreen extends screen {
    //attributes
    public static int eventStatus = 0;


    //constructor


    public eventsListScreen() {
    }

    //methods

    public void showEventInfo() { System.out.println("Show information for chosen event:"); }

    public void buyTicketOption() { System.out.println("Buy available tickets for chosen event:"); }

    public void showDataForm() { System.out.println("Fill in your transaction data: "); }

    public void checkDataForm() { System.out.println("Processing Data"); }

    public void showPayDataForm() { System.out.println("Fill in your payment data: "); }

    public void showMisData() { System.out.println("Show missing data of data form:"); }

    public void checkPayDataForm() { System.out.println("Processing Payment Data"); }

    public void notifyBank() { System.out.println("Notify bank about transaction"); }

    public void showWrongData() { System.out.println("Show wrong data of payment form:"); }

    public void showFail() { System.out.println("Transaction was not accepted on time ,therefore it was cancelled! "); }

    public void sendReceipt() { System.out.println("Payment was successfully accepted. Transaction receipt was sent via email."); }


    //getters and setters

    public static int getEventStatus() {
        return eventStatus;
    }

    public static void setEventStatus(int eventStatus) {
        eventsListScreen.eventStatus = eventStatus;
    }
}
