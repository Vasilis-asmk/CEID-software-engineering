public class eventOrganizer extends user{

    //attributes
    private int evOrgId;
    private String name;
    private String surname;

    //methods
    public void createEvent() {
        menu menu7 = new menu();
        menu7.createEventForm();
    }

    public void compEventForm() {
        System.out.println("Event organizer has fillen in the event form.");
    }

    //getters and setters

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

    public int getEvOrgId() {
        return evOrgId;
    }

    public void setEvOrgId(int evOrgId) {
        this.evOrgId = evOrgId;
    }
}
