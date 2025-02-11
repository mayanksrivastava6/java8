interface A {
    default void display() {
        System.out.println("Display method from Interface A");
    }
}

interface B {
    default void display() {
        System.out.println("Display method from Interface B");
    }
}

public class ques5 implements A, B {
    @Override
    public void display() {
        A.super.display();
        B.super.display();
        System.out.println("Display method from MultipleInheritanceExample");
    }

    public static void main(String[] args) {
        ques5 example = new ques5();
        example.display();
    }
}
