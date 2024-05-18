public class eventsListScreen extends screen {
    //attributes
    public static int eventStatus = 0;


    //constructor


    public eventsListScreen() {
    }

    //methods

    public void showEventInfo() {}

    public void buyTicketOption() {}

    public void showDataForm() {}

    public void checkDataForm() {}

    public void showPayDataForm() {}

    public void showMisData() {}

    public void checkPayDataForm() {}

    public void notifyBank() {}

    public void showWrongData() {}

    public void showFail() {}

    public void sendReceipt() {}


    //getters and setters

    public static int getEventStatus() {
        return eventStatus;
    }

    public static void setEventStatus(int eventStatus) {
        eventsListScreen.eventStatus = eventStatus;
    }
}
