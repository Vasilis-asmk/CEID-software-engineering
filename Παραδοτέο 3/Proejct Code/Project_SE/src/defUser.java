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
        System.out.println("Call Taxi,\n");
        System.out.println("Add Traffic Interrupt,\n");
        System.out.println("View Event\n");
        System.out.println("  ");
        Scanner page = new Scanner(System.in);
        pageName = page.nextLine();
        switch(pageName){

            case "Buy Transportation Tickets":
            openStore();
            break;

            case "View Transportation Routes":
            selectTs();
            break;

            case "Rent Parking Space":
            rentParking();
            break;

            case "Call Taxi":
            callTaxi();
            break;

            case "Add Traffic Interrupt":
            openTrafficPage();
            break;

            case "View Event":
            viewEvents();
            break;

            default:
                System.out.println("Incorrect");


        }
    }

    public void compDestForm() {

    }

    public void acceptRide() {

    }

    public void compDataForm() {
        System.out.println("User has filled in his transaction data");
    }


    public void completeRide() {
        System.out.println("The ride is completed.");
    }

    public void callTaxi() {
        menu Menu4 = new menu();
        if(taxiServiceScreen.taxiStatus == 1){
            Menu4.createDestForm();
        }
        else{
            Menu4.notifyFail();
        }
    }

    public void openTrafficPage() {
        menu Menu5 = new menu();
        if(trafficPage.trafficStatus == 1){
            Menu5.intDetForm();
        }
        else{
            Menu5.notifyFail();
        }
    }

    public void compIntForm() {

    }

    public void compMisData() {

    }

    public void viewEvents() {
        menu Menu6 = new menu();
        if(eventsListScreen.eventStatus == 1){
            Menu6.showEventList();
        }
        else{
            Menu6.notifyFail();
        }
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
    menu Menu1 = new menu();
    if(storeScreen.storeStatus == 1){
        Menu1.showAvailTrans();
    }
    else{
        Menu1.notifyFail();
    }

    }

    public void chooseProduct() {
        Scanner product = new Scanner(System.in);
        String productName = product.nextLine();
        if (productName == null)
            System.out.println("Incomplete Field");
        else {
            storeScreen store1 = new storeScreen();
            store1.showDataForm();
        }
    }

    public void compMisPayData() {

    }

    public void compWrongData() {

    }

    public void acceptTrans() {
        System.out.println("Transaction Accepted.");
    }

    public void rentParking() {
        menu Menu3 = new menu();
        if(parkingRentScreen.rentStatus == 1){
            Menu3.createAreaForm();
        }
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
        menu Menu2 = new menu();
        if(transSystemsScreen.tsStatus == 1){
            Menu2.showTs();
        }
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

