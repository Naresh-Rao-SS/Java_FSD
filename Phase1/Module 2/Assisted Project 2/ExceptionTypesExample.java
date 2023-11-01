package phase1module2;

class CustomException extends Exception {
	
    public CustomException(String message) {
        super(message);
    }
}

public class ExceptionTypesExample {
    public static void main(String[] args) {
        try {
            throwException();
        } 
        catch (CustomException e) {
            System.out.println("User Exception caught: " + e.getMessage());
        } 
        finally {
            System.out.println("Finally Execution");
        }
    }

    public static void throwException() throws CustomException {
    	
        throw new CustomException("This is a User exception.");
    }
}
