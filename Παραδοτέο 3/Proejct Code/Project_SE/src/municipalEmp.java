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
    public void acceptInt() {System.out.println("The municipal employee accepted the interrupt");}

    public void rejectInt() {System.out.println("The municipal employee rejected the interrupt");}

    public void eventAccept() {}

    public void eventDenial() {}

    public void rentAccept() { System.out.println("The municipal employee accepted the renting request!"); }

    public void insertAccept() { System.out.println("The municipal employee accepted the insertion request!"); }

    public void insertNotAccept() { System.out.println("The municipal employee did not accept the insertion request!");}


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












