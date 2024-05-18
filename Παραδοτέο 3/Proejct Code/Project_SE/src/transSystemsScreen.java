public class transSystemsScreen extends screen {
    //attributes
    public static int tsStatus = 1;


    //constructor

    public transSystemsScreen() {
    }

    //methods

    public void showItineraries() { System.out.println("Show itineraries for chosen route:"); }

    public void chooseBetween() {
        System.out.println("Choose between route of your own choice or system chosen route:");
    }

    public void showRoute() { System.out.println("Show details about the chosen route:"); }

    public void notifyRoute() {
        System.out.println("There is no available route for chosen itinerary!");
    }

    public void calcRoute() { System.out.println("System calculates the best route for chosen itinerary:"); }

    public void showDetails() { System.out.println("Show details about the chosen stop:"); }


    //getters and setters

    public static int getTsStatus() {
        return tsStatus;
    }

    public static void setTsStatus(int tsStatus) {
        transSystemsScreen.tsStatus = tsStatus;
    }
}
