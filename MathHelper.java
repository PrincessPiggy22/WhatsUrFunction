public class MathHelper {
    // TODO: Implement these methods

    // 1. Create a method called 'calculateSum' that takes two integers
    //    and returns their sum
    public static int calculateSum(int x, int y){
        return x + y;
    }

    // 2. Create a method called 'findMin' that takes two integers
    //    and returns the smaller one
    public static int findMin(int z, int a){
        if (z < a){
            return z;
        } else if (a < z) {
            return a;
        } else {
            return 0; // If the two integers are equal it will just output 0
        }
    }

    // 3. Create a void method called 'printResult' that takes an integer
    //    and prints "The result is: [number]"

    public static void printResult(int b){
        System.out.println("The result is: " + b);
    }

    public static void main(String[] args) {
        // Test your methods here
        int sum = calculateSum(15, 25);
        int min = findMin(10, 20);
        printResult(sum);
        printResult(min);
    }
}
