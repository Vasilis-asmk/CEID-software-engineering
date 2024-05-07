import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        createUser();
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
