package Com.javatraining.String.programs;

public class PalindromeCheck {
    public static void main(String[]args)
    {
        String input = "nitin";
        int lastCharIndex = input.length() -1;
        StringBuilder reverseString = new StringBuilder();
        while (lastCharIndex >= 0){
            char lastChar = input.charAt(lastCharIndex);
            reverseString.append(lastChar);
            lastCharIndex --;

        }
        System.out.println("reverse String "+reverseString);
        if (input.equals(reverseString.toString())){
            System.out.println("Input is palindrome");
        }
       else {
           System.out.println("input is not palindrome");
        }
    }
}
