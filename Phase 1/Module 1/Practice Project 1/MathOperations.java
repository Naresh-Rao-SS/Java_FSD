package phase1module2;

import java.io.*;

public class FileHandlingExample {
    public static void main(String[] args) {
        String docname = "rao.txt";
        
        // Create a file
        createFile(docname);
        
        // Write content to the file
        writeFile(docname, "Yo, Naresh Here");
        
        // Read and print the file content
        String content = readFile(docname);
        System.out.println("file info: " + content);
        
        // Update the file content
        updateFile(docname, "I'm from Norway");
        
        // Read and print the updated file content
        content = readFile(docname);
        System.out.println("updated info: " + content);

        // Delete the file
        deleteFile(docname);
    }

    public static void createFile(String docname) {
        File file = new File(docname);
        try {
            if (file.createNewFile()) {
                System.out.println("created sucessfully: " + docname);
            } else {
                System.out.println("exists: " + docname);
            }
        } catch (IOException e) {
            System.out.println("error creation: " +e.getMessage());
        }
    }

    public static void writeFile(String docname, String content) {
        try (FileWriter writer = new FileWriter(docname)) {
            writer.write(content);
            System.out.println("written sucessfully: " + docname);
        } catch (IOException e) {
            System.out.println("error writing: " + e.getMessage());
        }
    }

    public static String readFile(String docname) {
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(docname))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line);
            }
        } catch (IOException e) {
            System.out.println("error reading: " + e.getMessage());
        }
        return content.toString();
    }

    public static void updateFile(String docname, String newContent) {
        try (FileWriter writer = new FileWriter(docname)) {
            writer.write(newContent);
            System.out.println("updated sucessfully: " + docname);
        } catch (IOException e) {
            System.out.println("error Updating: " + e.getMessage());
        }
    }

    public static void deleteFile(String docname) {
        File file = new File(docname);
        if (file.delete()) {
            System.out.println("deleted sucessfully: " + docname);
        } else {
            System.out.println("Not Deleted: " + docname);
        }
    }
}
