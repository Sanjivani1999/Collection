package Com.javatraining.String.programs;

public class StringTest {
    public static void main(String[] args) {

        String name = "virat";
        System.out.println("name " + name);

        String name2 = new String("virat");
        System.out.println("name2 " + name2);


        char[] chars = {'v', 'i', 'r', 'a', 't'};
        String name3 = new String(chars);
        System.out.println("name3 " + name3);

        String name4 = new String(chars, 0, 3);
        System.out.println("name4 " + name4);

        String name5 = new String(name4);
        System.out.println("name5 " + name5);

        String name6 = new String(chars, 5, 2);
        System.out.println("name6 " + name6);


    }
}


