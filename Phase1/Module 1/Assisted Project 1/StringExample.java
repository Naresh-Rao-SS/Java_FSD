package Phase1;

public class StringExample {

    public static void main(String[] args) {

        // StringBuilder

    	
        System.out.println("Creating StringBuilder");
        
        StringBuilder builder = new StringBuilder("Yo");
        builder.append(" Bro");
        
        System.out.println(builder);
        System.out.println(builder.deleteCharAt(2));
        System.out.println(builder.insert(2, "l"));
        System.out.println(builder.insert(0, "Java "));
        System.out.println(builder.reverse());

        // Conversion
        System.out.println("\n");
        System.out.println("StringBuffer to StringBuilder");

        String str = "Yo";

        // Conversion from String object to StringBuffer
        StringBuffer buffer = new StringBuffer(str);
        buffer.reverse();
        System.out.println("String to StringBuffer");
        System.out.println(buffer);

        // Conversion from String object to StringBuilder
        StringBuilder builder1 = new StringBuilder(str);
        builder1.append(" bro");
        System.out.println("String to StringBuilder");
        System.out.println(builder1);
    }
}

