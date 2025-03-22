package Com.javatraining.String.programs;

public class PalindromeCheck2 {
    public static void main(String[] args) {
        int input = 127 ;


        int original = input;
        int reverse = 0;

        while (input > 0) {
            int lastDigit = input % 10; // because take last number from input
            reverse = reverse * 10 + lastDigit;//give the reverse num
            input = input / 10;//we remove last digit here
        }

        System.out.println("Reversed Number: " + reverse);

        if (original == reverse) {
            System.out.println("The number is a palindrome");
        } else {
            System.out.println("The number is not a palindrome");
        }
    }
}




