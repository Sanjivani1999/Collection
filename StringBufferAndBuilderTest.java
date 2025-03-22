package Com.javatraining.String.programs;

public class StringBufferAndBuilderTest {
    public static void main(String[] args){
        StringBuffer sb = new StringBuffer("good");
        sb.append("morning");
        System.out.println(sb.toString());

        StringBuilder stringBuilder = new StringBuilder("good");
        stringBuilder.append("morning");
        System.out.println(stringBuilder.toString());
    }
}
