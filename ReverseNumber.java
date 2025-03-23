package PrintHello;

public class ReverseNumber {
    public static void main(String[] args) {
        int number = 123456799 ;
        int rev = 0 ;// we declare rev for reverse a number

        while (number>0){
            rev = rev *10 +number%10;
            number = number/10;
        }
        System.out.println("The reverse number is :"+ rev);
    }
}
