package Com.javatraining.String.programs;

public class FibbonaciSeries {
    public static void main(String[]args)
    {
        int[]fibnocci = new int[20];
        fibnocci[0] = 0;
        fibnocci[1] = 1;
        for (int i = 2;i < 20; i++)
        {
           fibnocci[i] = fibnocci[i-1] +fibnocci[i-2];
        }
        for (int i : fibnocci){
            System.out.println(i);
        }
    }
}
