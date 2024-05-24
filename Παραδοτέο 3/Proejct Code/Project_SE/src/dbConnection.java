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
    int code;
    String title;
    String dateTime;
    int capacity;
    String organiserName;
    String location;
    String eventStreet;
    int eventNumber;
    int interruptCode;
    String interruptLocation;
    String interruptStreet;
    String interruptReason;
    String interruptDateTime;

    private static final String dBURL = "jdbc:mysql://localhost:3306/city_verse";


    //methods
    public void parking(int parkCode, String ownerFname, String email, String phone, String brand,String street, int number, int postCode, int afm, String invoice, int parkSpaces, String parkType) {

        this.parkCode = parkCode;
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

            String sql = "insert into parking (park_code, owner_fname, email, phone_number, brand, park_street, park_number, post_code, afm, invoice, park_spaces, park_type) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, parkCode);
            ps.setString(2, ownerFname);
            ps.setString(3, email);
            ps.setString(4, phone);
            ps.setString(5, brand);
            ps.setString(6, street);
            ps.setInt(7, number);
            ps.setInt(8, postCode);
            ps.setInt(9, afm);
            ps.setString(10, invoice);
            ps.setInt(11, parkSpaces);
            ps.setString(12, parkType);

            ps.executeUpdate();

        }

        catch (Exception e) {

        // Print the exception
        System.out.println(e);
    }

    }

    public void events(int code, String title, String dateTime, int capacity, String organiserName, String location, String eventStreet, int eventNumber) {

        this.code = code;
        this.title = title;
        this.dateTime = dateTime;
        this.capacity = capacity;
        this.organiserName = organiserName;
        this.location = location;
        this.eventStreet = eventStreet;
        this.eventNumber = eventNumber;

        try {
            Connection connection = DriverManager.getConnection(DB_URL, "root", "pass");

            String sql = "insert into events (event_code, title, event_datetime, capacity, organizer_name, location, event_street, event_number) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, code);
            ps.setString(2, title);
            ps.setString(3, dateTime);
            ps.setInt(4, capacity);
            ps.setString(5, organiserName);
            ps.setString(6, location);
            ps.setString(7, eventStreet);
            ps.setInt(8, eventNumber);

            ps.executeUpdate();

        }

        catch (Exception e) {

            // Print the exception
            System.out.println(e);
        }

    }

    private static final String DB_URL = "jdbc:mysql://localhost:3306/city_verse";

    public void interrupt(int interruptCode, String interruptLocation, String interruptStreet,String interruptReason,String interruptDateTime) {

        this.interruptCode = interruptCode;
        this.interruptLocation = interruptLocation;
        this.interruptStreet = interruptStreet;
        this.interruptReason = interruptReason;
        this.interruptDateTime = interruptDateTime;

        try {
            Connection connection = DriverManager.getConnection(DB_URL, "root", "pass");

            String sql = "insert into parking (int_code, int_location, int_street, int_reason, int_datetime) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, interruptCode);
            ps.setString(2, interruptLocation);
            ps.setString(3, interruptStreet);
            ps.setString(4, interruptReason);
            ps.setString(5, interruptDateTime);

            ps.executeUpdate();

        }

        catch (Exception e) {

            // Print the exception
            System.out.println(e);
        }

    }









    //getters and setters

}
