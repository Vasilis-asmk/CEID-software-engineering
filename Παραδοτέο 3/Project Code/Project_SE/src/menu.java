public class menu {
    //attributes


    //constructor

    public menu() {
    }


    // methods

    public void createDestForm() {
        System.out.println("Destination Form");
    }

    public void notifyFail() {
        System.out.println("Page not available!");
    }

    public void intDetForm() {
        System.out.println("Interrupt Form");
    }

    public void createEventForm() {
        System.out.println("Event Form");
    }

    public void showEventList() {
        System.out.println("Available Events");
    }

    public void noAvailEvent() {}

    public void showAvailTrans() {
        System.out.println("Choose between the following products: ");
        System.out.println("Bus Ticket");
        System.out.println("Train Ticket");
        System.out.println("Tram Ticket");
        System.out.println("Monthly Bus Card");
        System.out.println("Monthly Train Card");
        System.out.println("Monthly Tram Card");
    }

    public void createAreaForm() {
        System.out.println("Area Form");
        defUser defUser_rent = new defUser("name", "surname", 15);
        defUser_rent.compAreaForm();
    }

    public void showTs() {
        System.out.println("Routes");
    }

    public void createDataForm() {
        System.out.println("Fill in the data: ");
    }

    //getters and setters

}
