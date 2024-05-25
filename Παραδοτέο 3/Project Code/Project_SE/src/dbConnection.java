import java.sql.*;

public class dbConnection {

    //attributes
    int parkCode;
    String ownerFname;
    String email;
    String phone;
    String brand;
    String street;
    int number;
    int postCode;
    int afm;
    String invoice;
    int parkSpaces;
    String parkType;
    String title;
    String dateTime;
    int capacity;
    String organiserName;
    String location;
    String eventStreet;
    int eventNumber;
    String interruptLocation;
    String interruptStreet;
    String interruptReason;
    String interruptDateTime;

    private static final String dBURL = "jdbc:mysql://localhost:3306/city_verse";


    //methods
    public void parking(String ownerFname, String email, String phone, String brand,String street, int number, int postCode, int afm, String invoice, int parkSpaces, String parkType) {

        this.ownerFname = ownerFname;
        this.email = email;
        this.phone = phone;
        this.brand = brand;
        this.street = street;
        this.number = number;
        this.postCode = postCode;
        this.afm = afm;
        this.invoice = invoice;
        this.parkSpaces = parkSpaces;
        this.parkType = parkType;


        try {
            Connection connection = DriverManager.getConnection(DB_URL, "root", "pass");

            String sql = "insert into parking (owner_fname, email, phone_number, brand, park_street, park_number, post_code, afm, invoice, park_spaces, park_type) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, ownerFname);
            ps.setString(2, email);
            ps.setString(3, phone);
            ps.setString(4, brand);
            ps.setString(5, street);
            ps.setInt(6, number);
            ps.setInt(7, postCode);
            ps.setInt(8, afm);
            ps.setString(9, invoice);
            ps.setInt(10, parkSpaces);
            ps.setString(11, parkType);

            ps.executeUpdate();

        }

        catch (Exception e) {

        // Print the exception
        System.out.println(e);
    }

    }

    public void events(String title, String dateTime, int capacity, String organiserName, String location, String eventStreet, int eventNumber) {

        this.title = title;
        this.dateTime = dateTime;
        this.capacity = capacity;
        this.organiserName = organiserName;
        this.location = location;
        this.eventStreet = eventStreet;
        this.eventNumber = eventNumber;

        try {
            Connection connection = DriverManager.getConnection(DB_URL, "root", "pass");

            String sql = "insert into events (title, event_datetime, capacity, organizer_name, location, event_street, event_number) VALUES (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, title);
            ps.setString(2, dateTime);
            ps.setInt(3, capacity);
            ps.setString(4, organiserName);
            ps.setString(5, location);
            ps.setString(6, eventStreet);
            ps.setInt(7, eventNumber);

            ps.executeUpdate();

        }

        catch (Exception e) {

            // Print the exception
            System.out.println(e);
        }

    }

    private static final String DB_URL = "jdbc:mysql://localhost:3306/city_verse";

    public void interrupt(String interruptLocation, String interruptStreet,String interruptReason,String interruptDateTime) {

        this.interruptLocation = interruptLocation;
        this.interruptStreet = interruptStreet;
        this.interruptReason = interruptReason;
        this.interruptDateTime = interruptDateTime;

        try {
            Connection connection = DriverManager.getConnection(DB_URL, "root", "pass");

            String sql = "insert into interrupts (int_location, int_street, int_reason, int_datetime) VALUES (?, ?, ?, ?)";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, interruptLocation);
            ps.setString(2, interruptStreet);
            ps.setString(3, interruptReason);
            ps.setString(4, interruptDateTime);

            ps.executeUpdate();

        }

        catch (Exception e) {

            // Print the exception
            System.out.println(e);
        }

    }









    //getters and setters

}
