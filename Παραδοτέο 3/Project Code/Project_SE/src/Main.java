import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //defUser user1 = new defUser("", "surname", 15);
        //user1.chooseScreen();
        formCompletion();
        eventCreation();
        // parkingEmp parkemp = new parkingEmp();
    }
/*
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
        user1.chooseScreen();
    }*/

    public static void eventCreation() {
        eventCreationScreen screen1 = new eventCreationScreen();
        screen1.createEventForm();
    }

    public static void formCompletion() {
        registerForm screen2 = new registerForm();
        screen2.createRegisterForm();
    }

}
