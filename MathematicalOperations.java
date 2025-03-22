public class MathematicalOperations {

        public static int addition(int a, int b) {
            return a + b;
        }

        public static int subtraction(int a, int b) {
            return a - b;
        }
        public static int multiplication(int a, int b) {
            return a * b;
        }
        public static double division(int a, int b) {
            if (b == 0) {
                System.out.println("Error: Division by zero is not allowed.");
                return 0;
            }
            return (double) a / b;
        }


        public static void main(String[] args) {
            int num1 =0, num2 = 5;


            int add = addition(num1, num2);
            int sub = subtraction(num1, num2);
            int mul = multiplication(num1, num2);
            double div = division(num1, num2);

            System.out.println("Addition: " + add);
            System.out.println("Subtraction: " + sub);
            System.out.println("Multiplication: " + mul);
            System.out.println("Division: " + div);
        }
    }

