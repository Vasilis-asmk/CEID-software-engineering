import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class eventCreationScreen extends screen {

    //attributes

    private JTextField title;
    private JTextField starts;
    private JTextField location;
    private JTextField typeOfEvent;
    private JButton add;
    private JTextField moreInform;
    private JLabel titleLabel;
    private JLabel locationLabel;
    private JLabel typeOfEventLabel;
    private JLabel moreInformLabel;
    private JLabel todayLabel;
    private JLabel patrasLabel;
    private JLabel eventsLabel;
    private JLabel newEventLabel;
    private JLabel start;
    private JPanel Panel1;
    private JTextField capacity;
    private JLabel capacityLabel;


    //constructor

    public eventCreationScreen() {
        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(add,"Success!");
                String titleVal = title.getText();
                String dateVal = starts.getText();
                String capVal = capacity.getText();
                int capacityVal = Integer.parseInt(capVal);
                String locationVal = location.getText();
                String typeOfEventVal = typeOfEvent.getText();
                String moreInformVal  = moreInform.getText();
                insertIntoDbase(titleVal, dateVal, capacityVal, locationVal, typeOfEventVal, moreInformVal);
            }
        });
    }



    // methods

    public void createEventForm() {
        eventCreationScreen scr1 = new eventCreationScreen();
        scr1.setContentPane(scr1.Panel1);
        scr1.setVisible(true);
        scr1.setSize(600, 400);
        scr1.setTitle("Event Creation");
        scr1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

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
        //insertIntoDbase();
    }

   public void insertIntoDbase(String title, String datetime, int capacity, String location, String eventType, String eventInfo) {
       dbConnection event_insertion = new dbConnection();
       event_insertion.events(title, datetime, capacity, location, eventType, eventInfo);
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
