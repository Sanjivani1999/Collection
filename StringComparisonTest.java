package Com.javatraining.String.programs;

public class StringComparisonTest {
    public static void main(String[] args){
        String s1 = "Hello";
        String s2 = new String(s1);
        if(s1.equals(s2)){
            System.out.println("Equal");
        }else{
            System.out.println("Un Equal");
        }

        if(s1 == s2){
            System.out.println("Equal");
        }else{
            System.out.println("Un Equal");
        }
    }
}

