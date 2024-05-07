import java.util.Scanner;

public class defUser extends user{
    //atttrinutes
    private String name;
    private String surname;
    private int defUserId;

    //constuctor
    public defUser(String name,String surname,int id) {
    }


    //methods
    public void chooseScreen() {
        String pageName;
        System.out.println("Choose between available screens:\nBuy Transportation Tickets,\n");
        System.out.println("View Transportation Routes,\n");
        System.out.println("Rent Parking Space,\n");
        System.out.println("Insert New Parking,\n");
        System.out.println("Call Taxi,\n");
        System.out.println("Add Traffic Interrupt,\n");
        System.out.println("Create Event,\n");
        System.out.println("View Event\n");
        Scanner page = new Scanner(System.in);
        pageName = page.nextLine();
        switch(pageName){

            case "Buy Transportation Tickets":


        }
    }

    public void compDestForm() {

    }

    public void acceptRide() {

    }

    public void compDataForm() {

    }


    public void completeRide() {
        System.out.println("The ride is completed.");
    }

    public void callTaxi() {

    }

    public void openTrafficPage() {

    }

    public void compIntForm() {

    }

    public void compMisData() {

    }

    public void viewEvents() {

    }

    public void pickEvent() {

    }

    public void addToFavourites() {

    }

    public void buyTickets() {

    }

    public void compPayDataForm() {

    }

    public void openStore() {

    }

    public void chooseProduct() {

    }

    public void compMisPayData() {

    }

    public void compWrongData() {

    }

    public void acceptTrans() {
        System.out.println("Transaction Accepted.");
    }

    public void rentParking() {

    }

    public void compAreaForm() {

    }

    public void selectPrivateParking() {
        System.out.println("Private Parking Selected");
    }

    public void selectPublicParking() {
        System.out.println("Public Parking Selected");
    }

    public void selectParking() {

    }

    public void compDataAndPayWayForm() {

    }

    public void selectTs() {

    }

    public void chooseTs() {

    }

    public void chooseDetIti() {
        System.out.println("Select detailed itineraries option");
    }

    public void chooseRoute() {

    }

    public void sysChooseRoute() {
        System.out.println("Allow system to choose best route");
    }

    public void chooseStop() {

    }

    //getters and setters

    public int getDefUserId() {
        return defUserId;
    }

    public void setDefUserId(int defUserId) {
        this.defUserId = defUserId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}

