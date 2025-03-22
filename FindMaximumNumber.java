package Com.javatraining.String.programs;

public class FindMaximumNumber {
    public static void main(String[] args) {
        int[] input = {1, 2, 3, 4, 99};
        int max = input[0];

        for (int i : input) {
            System.out.println(i);
            if (i > max) {
                max = i;
            }
        }


        System.out.println("Maximum number is: " + max);
    }
}
