public class trafficPage extends screen{

    //attributes
    public static int trafficStatus = 1;

    //constructor
    public trafficPage() {
    }

    //methods
    public void checkIntForm() {

    }

    public void notifiyEmp() {
        System.out.println("Notify employee about traffic interrupt");
    }

    public void shopMisData() {

    }

    public void notifyRej() {
        System.out.println("Interrupt has been rejected by an employee");
    }

    public void notifyAcc() {
        System.out.println("Interrupt has been accepted by an employee");
    }

    public void shareInt() {

    }

    public void showIntList() {

    }

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
