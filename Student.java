package Com.javatraining.String.programs;

public class Student {
    private String name;
    private int age;
    private int rollNumber;

    public Student(String name, int age, int rollNumber){
        this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;
    }

    @Override
    public String toString(){
        return "name - " + this.name + " age " + this.age + " roll number "+ this.rollNumber;
    }
}
