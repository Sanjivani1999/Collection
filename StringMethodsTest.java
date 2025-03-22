package Com.javatraining.String.programs;

public class StringMethodsTest {
    public static void main(String[] args){

        String name = "Axar's is a spin bowler";
        //"01234
        char[] dest = new char[4];
        name.getChars(0,4,dest, 0);
        System.out.println(dest);
        char[] charArray = name.toCharArray();
        System.out.println(charArray);

        String first = "axar";
        String second = "Axar";
        if(first.equalsIgnoreCase(second)){//string1.equals(string2)
            System.out.println("Strings are equal");
        }else{
            System.out.println("Strings are not equal");
        }

        String playerData = "Player name is Ravindra";
        if(playerData.startsWith("Player name is")){
            System.out.println("string is starting with Player name is");
        }

        if(playerData.endsWith("Ravindra")){
            System.out.println("string is ending  with Ravindra");
        }
    }
}


