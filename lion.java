package AbstractMethods;

import Com.Inheritance.Animal;

public class lion extends WAnimal {
    @Override
    public void makeNoise() {
        System.out.println("Roars");
    }

    @Override
    public void run() {
        System.out.println("runs very fast");
    }
}
