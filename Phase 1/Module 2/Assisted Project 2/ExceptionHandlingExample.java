package phase1module2;

public class ExceptionHandlingExample {
	
    public static void main(String[] args) {
        try {
            int result = 10 / 0; // Attempting to divide by zero
        } 
        catch (ArithmeticException e) {
        	System.out.println("Exception caught: " + e);
        }
        finally {
            System.out.println("Finally block executed");
        }
    }
}
