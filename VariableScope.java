public class VariableScope {

    // 1. Create a method called 'tryToModify' that takes an integer parameter,
    //    adds 10 to it, and prints the value inside the method
    public static void tryToModify(int x){
        System.out.println(x + 10);
    }

    // 2. Create a method called 'processArray' that takes an integer array,
    //    doubles each element, and prints the array
    public static void processArray(int[] y){
        for (int i = 0; i < y.length; i++){
           y[i] = y[i] * 2; // https://codingbat.com/doc/java-array-loops.html helped me
        }
        for(int val : y) System.out.print(val + " "); // Printing Code copied from below
        System.out.println();
    }

    // 3. Create a method called 'demonstrateScope' that:
    //    - Declares a local variable 'x' with value 100
    //    - Uses a for loop (int i = 0; i < 3; i++)
    //    - INSIDE the for loop body, declare a variable 'y' with value i * 10
    //    - Prints both x and y inside the loop

    public static void demonstrateScope(){
        int x = 100;
        for (int i = 0; i < 3; i++){
            int y = i * 10;
            System.out.println(x);
            System.out.println(y);
        }
        //    - Try to print y outside the loop (what happens?)
        // System.out.println(y); - It won't work because it was defined w/ in the for loop
    }

    public static void main(String[] args) {
        int number = 5;
        System.out.println("Before method call: " + number);
        tryToModify(number);
        System.out.println("After method call: " + number);

        int[] arr = {1, 2, 3, 4, 5};
        System.out.print("Before: ");
        for(int val : arr) System.out.print(val + " ");
        System.out.println();

        processArray(arr);

        System.out.print("After: ");
        for(int val : arr) System.out.print(val + " ");
        System.out.println();

        demonstrateScope();
    }
}
