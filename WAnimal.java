package AbstractMethods;

public abstract class WAnimal {
    public final int getNumberOfEyes(){
        return 2;
    }
    public int getNumberOfLegs(){
        return 4;
    }

    public abstract void makeNoise();

    public abstract void run();

}
