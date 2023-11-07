package phase1module2;

class Rectangle {
    private int l;
    private int w;

    public Rectangle(int l, int w) {
        this.l = l;
        this.w = w;
    }

    public int calculateArea() {
        return l * w;
    }
}

public class PillarsExample {
    public static void main(String[] args) {
        Rectangle myRectangleobj = new Rectangle(5, 3);
        int area = myRectangleobj.calculateArea();
        
        System.out.println("Area value of the rectangle: " + area);
        System.out.println("");
    }
}
