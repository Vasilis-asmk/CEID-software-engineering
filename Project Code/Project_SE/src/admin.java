public class admin extends user{
    //attributes
    private String name;
    private String surname;
    private double salary;
    private String empDate;

    //methods



    //getters and setters
    public String getEmpDate() {
        return empDate;
    }

    public void setEmpDate(String empDate) {
        this.empDate = empDate;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
