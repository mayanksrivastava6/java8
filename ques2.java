interface Operation {
    int execute(int a, int b);
}

public class ques2 {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        ques2 calc = new ques2();

        Operation addition = calc::add;
        Operation subtraction = calc::subtract;

        Operation multiplication = ques2::multiply;

        int a = 10, b = 5;
        System.out.println("Addition: " + addition.execute(a, b));
        System.out.println("Subtraction: " + subtraction.execute(a, b));
        System.out.println("Multiplication: " + multiplication.execute(a, b));
    }
}
