import java.util.*;
interface Compare{
   Boolean isGreater(int a, int b);
}
interface Increment{
    int addOne (int a);
}
interface Concatenate{
     String addition(String a, String b);
}
interface Convert{
    String convert(String s);
}
public class ques1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers to compare:");
        int t1 = scanner.nextInt();
        int t2 = scanner.nextInt();

        System.out.println("Enter a number to increment:");
        int t3 = scanner.nextInt();

        scanner.nextLine();
        System.out.println("Enter two strings for concatenation:");
        String t4 = scanner.nextLine();
        String t5 = scanner.nextLine();

        System.out.println("Enter a string to convert to uppercase:");
        String t6 = scanner.nextLine();
        Compare num = (a1, a2) -> a1 > a2;
        if (num.isGreater(t1, t2)) {
            System.out.println(t1 + " is greater");
        } else {
            System.out.println(t2 + " is greater");
        }
        Increment increment = (a) -> a + 1;
        System.out.println("Incremented value: " + increment.addOne(t3));
        Concatenate concatenate = (a, b) -> a + b;
        System.out.println("Concatenated string: " + concatenate.addition(t4, t5));

        Convert convert = (s) -> s.toUpperCase();
        System.out.println("Uppercase string: " + convert.convert(t6));

    }

}
