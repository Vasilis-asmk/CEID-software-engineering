import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // createUser();
        // defUser user1 = new defUser("name", "surname", 15);
        //user1.chooseScreen();

        parkingEmp parkemp = new parkingEmp();
        parkemp.acceptTrans();

        eventCreationScreen event_creation = new eventCreationScreen();
        event_creation.createEvent();

        trafficPage interrupt_insert = new trafficPage();
        interrupt_insert.notifyAcc();

    }

    public static void createUser(){
        String name;
        String surname;
        int id;

        Scanner defUser = new Scanner(System.in);
        System.out.println("Enter your name: ");
        name = defUser.nextLine();
        System.out.println("Enter your surname: ");
        surname = defUser.nextLine();
        System.out.println("Enter your id: ");
        id = defUser.nextInt();

        defUser user1 = new defUser(name,surname,id);
    }

}
