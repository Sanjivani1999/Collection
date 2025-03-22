public class ShapeOperationsTest {
    public static void main(String[]args)
    {
        ShapeOperations shapeOperations = new ShapeOperations();
       int areaofsquare  = shapeOperations.calculateareaofSquare( 4);
        System.out.println("area of Square is:"+ areaofsquare);
        int areaofrectangle = shapeOperations.calculateareaogrectangle(4,10 );
          System.out.println("area of Rectangle:"+areaofrectangle);
          double areaofTriangle = shapeOperations.calculateareaofTriangle(7,9);
          System.out.println("area of Traingle is:"+areaofTriangle);
    }
    }

