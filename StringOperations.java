package Com.javatraining.String.programs;

public class StringOperations {

    public static void main(String[] args) {

        String name = "Virat";
        int length = name.length();
        System.out.println("length is " + length);

        String lastName = "Kohli";
        String fullName = name + lastName;
        int age = 37;
        System.out.println("full name is " + fullName + " his age is " + age);

        Student student1 = new Student("virat", 10, 30);
        System.out.println(student1);

        String playerName = "Rohit";
        for(int i = 0;i<playerName.length() ; i++) {
            System.out.println("character at " + i + " index is " + playerName.charAt(i));
        }
        int j = 0;
        while(j < playerName.length()){
            System.out.println("character at " + j + " index is " + playerName.charAt(j));
            j++;
        }


    }
}


