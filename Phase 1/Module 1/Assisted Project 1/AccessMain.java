package Phase1;

public class AccessMain {
    public static void main(String[] args) {
        AccessModifiers obj = new AccessModifiers();

        System.out.println("Public Variable: " + obj.publicVariable);
        // System.out.println("Private Variable: " + obj.privateVariable); // This will cause an error
        System.out.println("Protected Variable: " + obj.protectedVariable);
        System.out.println("Default Variable: " + obj.defaultVariable);

        obj.publicMethod();
        // obj.privateMethod(); // This will cause an error
        obj.protectedMethod();
        obj.defaultMethod();
    }
}