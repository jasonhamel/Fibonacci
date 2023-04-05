public class Main {
    public static void main(String[] args) {
        System.out.println("Fibonacci iterative: " + fibonacciIterative(6));
        System.out.println("Fibonacci recursive: " + fibonacciRecursive(6));
    }

    public static int fibonacciIterative(int number) {
        int valueToReturn = 1;
        int previousValue = 1;
        int holdingPrevious;
        for (int i = 2; i < number; i++) {
            holdingPrevious = valueToReturn;
            valueToReturn = valueToReturn + previousValue;
            previousValue = holdingPrevious;
        }
        return valueToReturn;
    }

    public static int fibonacciRecursive(int number) {
        if (number < 2) {
            return number;
        }
        return fibonacciRecursive(number - 1) + fibonacciRecursive(number - 2);
    }

}