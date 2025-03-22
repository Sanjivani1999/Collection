public class CallByValue {
    public void updateNumbers(int firstNumber, int secondNumber) {

        firstNumber = firstNumber * 2;
        secondNumber = secondNumber * 3;
        System.out.println("inside updateNumbers method firstNumber " + firstNumber
                + " secondNumber " + secondNumber);
    }

    public static void main(String[] args) {
        int firstNumber = 10;
        int secondNumber = 15;

        System.out.println("before update firstNumber " + firstNumber
                + " secondNumber " + secondNumber);

        CallByValue callByValueTest = new CallByValue();
        callByValueTest.updateNumbers(firstNumber, secondNumber);

        System.out.println("after update firstNumber " + firstNumber
                + " secondNumber " + secondNumber);
    }
}


