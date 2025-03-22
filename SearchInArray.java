public class SearchInArray {
    public static void main(String[]args)
    {
        int [] input  = {2,3,4,5,6,7,8,9};
        int search = 9;
        for (int i : input)
        {
            if( i == search)
            {
                System.out.println("key find ");
                break;
            }



        }
        System.out.println("Sorry i cant find it");
    }

}
