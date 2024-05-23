import java.sql.*;

public class dbConnection {

    //attributes
    int parkcode;
    String owner_fname;
    String email;
    String phone;
    String brand;
    String street;
    int number;
    int post_code;
    int afm;
    String invoice;
    int park_spaces;
    String park_type;


    //methods
    private static final String DB_URL = "jdbc:mysql://localhost:3306/city_verse";

    public void parking(int parkcode, String owner_fname, String email, String phone, String brand,String street, int number, int post_code, int afm, String invoice, int park_spaces, String park_type) {

        this.parkcode = parkcode;
        this.owner_fname = owner_fname;
        this.email = email;
        this.phone = phone;
        this.brand = brand;
        this.street = street;
        this.number = number;
        this.post_code = post_code;
        this.afm = afm;
        this.invoice = invoice;
        this.park_spaces = park_spaces;
        this.park_type = park_type;


        try {
            Connection connection = DriverManager.getConnection(DB_URL, "root", "pass");

            String sql = "insert into parking (park_code, owner_fname, email, phone_number, brand, park_street, park_number, post_code, afm, invoice, park_spaces, park_type) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, parkcode);
            ps.setString(2, owner_fname);
            ps.setString(3, email);
            ps.setString(4, phone);
            ps.setString(5, brand);
            ps.setString(6, street);
            ps.setInt(7, number);
            ps.setInt(8, post_code);
            ps.setInt(9, afm);
            ps.setString(10, invoice);
            ps.setInt(11, park_spaces);
            ps.setString(12, park_type);

            ps.executeUpdate();
        }

        catch (Exception e) {

        // Print the exception
        System.out.println(e);
    }

    }
    //getters and setters

}
