public class Calculator {
    // TODO: Create multiple versions of a 'multiply' method that can handle:
    // 1. Two integers
    public static int multiply(int x,int y){
        return x * y;
    }

    // 2. Three integers
    public static int multiply(int z, int a, int b){
        return z * a * b;
    }

    // 3. Two double values
    public static double multiply(double c, double d){
        return c * d;
    }

    // 4. An integer and a string (repeat the string that many times)
    public static void multiply(int e, String f){
       System.out.print(f.repeat(e));
        //return f.repeat(e);
    }

    public static void main(String[] args) {
        // Test all your overloaded methods
        System.out.println("Two ints: " + multiply(5, 3));
        System.out.println("Three ints: " + multiply(5, 3, 2));
        System.out.println("Two doubles: " + multiply(5.5, 3.2));
        System.out.print("Int and string: " );
        multiply(3,"Hi!");
    }
}
