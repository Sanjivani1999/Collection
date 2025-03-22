package Com.javatraining.String.programs;

public class ModificationStringTest {
    public static void main(String[] args) {
        String s = "Hello World";
        System.out.println("s.substring(6) :" + s.substring(6));
        System.out.println("s.substring(6, 8) :" + s.substring(6, 8));

        String s1 = "Hello";
        String s2 = "Java";
        String s3 = "World";
        System.out.println(s1 + s2 + s3);
        System.out.println(s1.concat(s2).concat(s3));

        String hello = "Java";
        System.out.println(hello.replace('a', 'm'));
        System.out.println(hello.replace('v', 'h'));
        System.out.println(hello.replace('o','d'));

        String helloWithSpace = "    hello     ";
        System.out.println("string:" + helloWithSpace);
        System.out.println("string:" + helloWithSpace.trim());

        String changeCase = "HellO";
        System.out.println(changeCase.toUpperCase());
        System.out.println(changeCase.toLowerCase());

        System.out.println(String.join(",", "EUR", "INR", "90"));
        System.out.println(String.join("   ", changeCase.toLowerCase(), changeCase.toUpperCase()));

    }
}


