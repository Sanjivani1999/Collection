package Com.Inheritance;

public class parent {
    protected String surname;
    protected String address;

    public parent(String surname, String address) {
        this.surname = surname;
        this.address = address;
    }

    public void display() {
        System.out.println("surname " + surname + " address " + address);
    }
}