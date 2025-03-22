package Com.Inheritance;

public class Dog extends Animal {
    private String breed;


    public Dog(String Name, String colour, String speciality, String breed) {
        super(Name, colour, speciality);
        this.breed = breed;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Breed: " + breed);
    }

    public void bark() {
        System.out.println(Name + " is barking!");
    }
}


