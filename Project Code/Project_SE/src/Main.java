import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        formCompletion();
        // Η επόμενη μέθοδος εμφανίζει και αυτή GUI.
        // Για να μην εμφανίστει ταυτόχρονα με το GUI της προηγούμενης την τοποθετήσαμε σε σχόλιο.
        //eventCreation();
        parkingEmp parkEmp = new parkingEmp();
        parkEmp.acceptTrans();
        eventCreationScreen eventCreate = new eventCreationScreen();
        eventCreate.createEvent();
        trafficPage interruptInform = new trafficPage();
        interruptInform.notifyAcc();

    }

    public static void eventCreation() {
        eventCreationScreen screen1 = new eventCreationScreen();
        screen1.createEventForm();
    }

    public static void formCompletion() {
        registerForm screen2 = new registerForm();
        screen2.createRegisterForm();
    }

}
