package Com.Inheritance;

public class InheritanceTest {
    public static void main(String[] args){
        parent parent = new parent("Kohli", "Delhi");
        parent.display();

        Child child = new Child("Kohli", "Delhi", "Vamika");
        child.display();
    }
}
