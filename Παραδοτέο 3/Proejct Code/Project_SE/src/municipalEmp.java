public class municipalEmp extends user{

    //attributes
    private String name;
    private String surname;
    private String empDate;
    private double salary;

    //constructor
    public municipalEmp() {
    }

    //methods
    public void acceptInt() {}
    public void rejectInt() {}
    public void eventAccept() {}
    public void eventDenial() {}
    public void rentAccept() { System.out.println("Parking space accepted!"); }
    public void insertAccept() {}
    public void insertNotAccept() {}


    //getters and setters

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEmpDate() {
        return empDate;
    }

    public double getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setEmpDate(String empDate) {
        this.empDate = empDate;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    
}












