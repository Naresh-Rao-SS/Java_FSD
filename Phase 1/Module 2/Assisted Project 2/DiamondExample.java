package phase1module2;

interface A {
    default void display() {
        System.out.println("Display Interface A");
    }
}

interface B extends A {
    default void display() {
        System.out.println("Display Interface B");
    }
}

class C implements B {
    public void display() {
        B.super.display(); // Call the display() of Interface B
        System.out.println("Display Class C");
    }
}

public class DiamondExample {
    public static void main(String[] args) {
        C myObjectobj = new C();
        myObjectobj.display();
    }
}
