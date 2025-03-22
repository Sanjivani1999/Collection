package Com.javatraining.String.programs;

public class FindMinimumNumber {
    public static void main(String[]args)
    {
        int[] input = {2,3,4,5,6};
        int min  = input[0];
        for (int i : input)
        {
            System.out.println(i);
            if(i < min)
            {
                min = i;
            }

        }
        System.out.println("Minimum number is"+min);


    }
}
