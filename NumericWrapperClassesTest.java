package WrapperClassUse;

public class NumericWrapperClassesTest {
    public static void main(String[] args) {
            Integer num1 =  Integer.valueOf(100);
            Integer num2 =  Integer.valueOf(200);
            Integer num3 = Integer.parseInt("100");

            Integer addition = num1+num2;
            System.out.println(addition);

            //long value add
        Long l1 = Long.valueOf(2000);
        // we can assign value like this also
        //Long l1 =200;
        l1.longValue();


    }
}
