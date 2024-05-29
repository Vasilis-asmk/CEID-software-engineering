import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class eventCreationScreen extends screen {
    private JTextField title;
    private JTextField starts;
    private JTextField ends;
    private JTextField location;
    private JTextField typeOfEvent;
    private JButton add;
    private JTextField moreInform;
    private JLabel titleLabel;
    private JLabel endsLabel;
    private JLabel locationLabel;
    private JLabel typeOfEventLabel;
    private JLabel moreInformLabel;
    private JLabel todayLabel;
    private JLabel patrasLabel;
    private JLabel eventsLabel;
    private JLabel newEventLabel;
    private JLabel start;
    //attributes


    //constructor

    public eventCreationScreen() {
        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }


    // methods

    public void checkEventForm() {
        System.out.println("Processing event form");
    }

    public void notifyMunicipalEmployee() {
        System.out.println("Event creation request!");
    }

    public void showMisData() {
        System.out.println("Show missing data of data form:");
    }

    public void showUnavailData() {
        System.out.println("Chosen event details are not available.");
    }

    public void denialInform() {
        System.out.println("Event creation failed!");
    }

    public void createEvent() {

        System.out.println("Event has been accepted and created.");
        insertIntoDbase();
    }

    public void insertIntoDbase() {
        dbConnection event_insertion = new dbConnection();
        event_insertion.events("event.title","25/06/2024 18:00",50,"name","event.location","event.street",15);
        System.out.println("Event has been inserted to the database.");
    }

    public void addToEvents() {
        System.out.println("Event has been added to the events list.");
    }

    public void eventCreationCompleted() {
        System.out.println("Event creation has been completed");
    }



    //getters and setters

}
