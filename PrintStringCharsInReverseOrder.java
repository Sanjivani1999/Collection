package Com.javatraining.String.programs;

public class PrintStringCharsInReverseOrder {
    public static void main(String[] args) {
        String name = "naman";

        System.out.println("Actual name " + name);

        System.out.println("Reverse order");
        int lastIndex = name.length() - 1;
        String reverString = "";
        while (lastIndex >= 0) {
            char c = name.charAt(lastIndex);
            reverString = reverString + c;
            lastIndex--;
            System.out.println("char " + c);
            System.out.println("reversString " + reverString);
        }
        if(name.equals(reverString)){
            System.out.println("name is palindrome");
        }else {
            System.out.println("name is not a palindrome");
        }
    }
}


