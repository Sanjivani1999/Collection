package Com.Inheritance;

public class Animal {
    public  String Name;
    public String colour;
    public String speciality;

    public Animal (String breedType,String colour,String speciality )
    {
        this.Name = Name;
        this.colour = colour;
        this.speciality = speciality;
    }
    public void display(){
        System.out.println("Name of animal"+ Name + "colour "+ colour+ "speciality"+speciality);
    }
}
