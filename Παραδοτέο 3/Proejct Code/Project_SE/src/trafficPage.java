public class trafficPage extends screen{

    //attributes
    public static int trafficStatus = 1;

    //constructor
    public trafficPage() {
    }

    //methods
    public void checkIntForm() {System.out.println("Processing interrupt data"); }

    public void notifiyEmp() {
        System.out.println("Notify employee about traffic interrupt");
    }

    public void showMisData() { System.out.println("Show missing data of interrupt form");}

    public void notifyRej() {
        System.out.println("Interrupt has been rejected by an employee"); }

    public void notifyAcc() {
        System.out.println("Interrupt has been accepted by an employee"); }

    public void shareInt() { System.out.println("The interrupt has been shared in the map"); }

    public void showIntList() {  System.out.println("Interrupt list"); }

    public void sendConfirm() {
        System.out.println("Interrupt is now visible on map and on list");
    }

    //getters and setters

    public static int getTrafficStatus() {
        return trafficStatus;
    }

    public static void setTrafficStatus(int trafficStatus) {
        trafficPage.trafficStatus = trafficStatus;
    }
}
