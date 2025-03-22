public class BoxOperations {
    public static void main ( String[]args)
    {
        Box box = new Box();
        box.width = 6;
        box.depth = 4;
        box.height =8;

        int boxVolume = box.CalculateVolume();
        System.out.println(" the box volume is :"+boxVolume);

        Box anotherbox =  new Box();
        box.width = 0;
        box.depth = 4;
        box.height =8;
        int secondbox =box.CalculateVolume();
        System.out.println("another box volume is :"+secondbox);
    }
}
