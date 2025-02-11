interface Operation {
    int execute(int a, int b);
}

public class ques2 {

    // Instance methods for addition and subtraction
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    // Static method for multiplication
    public static int multiply(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        ques2 calc = new ques2();

        // Instance method reference for add and subtract
        Operation addition = calc::add;
        Operation subtraction = calc::subtract;

        // Static method reference for multiply
        Operation multiplication = ques2::multiply;

        int a = 10, b = 5;
        System.out.println("Addition: " + addition.execute(a, b));
        System.out.println("Subtraction: " + subtraction.execute(a, b));
        System.out.println("Multiplication: " + multiplication.execute(a, b));
    }
}
