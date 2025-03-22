package Com.javatraining.String.programs;

public class StringComparisionTest {

        public static void main(String[] args){
            String a1 = "Hello";
            String a2 = new String(a1);
            if(a1.equals(a2)){
                System.out.println("Good");
            }else{
                System.out.println("Bad");
            }

            if(a1 == a2){
                System.out.println("Equal");
            }else{
                System.out.println("Un Equal");
            }
        }
    }


