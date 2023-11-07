package Phase1;

public class Constructor {
    public Constructor() {
        System.out.println("This is Default Constructor");
    }

    public Constructor(int num) {
        System.out.println("This Parameterized Constructor with num = " + num);
    }

    public static void main(String[] args) {
        Constructor inputobj1 = new Constructor();
        Constructor inputobj2 = new Constructor(42);
    }
}
