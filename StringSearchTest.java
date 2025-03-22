package Com.javatraining.String.programs;

public class StringSearchTest {
    public static void main(String[] args){
        String s = "Now is the time for all good men to come to " +
                "the aid of their country";
        System.out.println(s);
        System.out.println("index(t) = "+ s.indexOf('t'));
        System.out.println("lastIndex(t) = "+ s.lastIndexOf('t'));
        System.out.println("index(the) = "+ s.indexOf("the"));
        System.out.println("lastIndex(the) = "+ s.lastIndexOf("the"));


    }
}
