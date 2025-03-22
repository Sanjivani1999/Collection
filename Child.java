package Com.Inheritance;

public class Child extends parent {

    private String name;

    public Child(String surname, String address, String name) {
        super(surname, address);
        this.name = name;
    }

    public void display() {
        System.out.println("Surname " + super.surname +
                " address " + super.address +
                " name " + this.name);
    }
}
