package phase1module2;

import java.io.*;

public class CrudExample {
	public static void main(String[] args) {
		// Creating a file
		try {
			File file = new File("rao.txt");
			if (file.createNewFile()) {
				System.out.println("File created Successfully: " + file.getName());
				System.out.println("");
			} else {
				System.out.println("File already there.");
				System.out.println("");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		// Reading a file
		try {
			File file = new File("rao.txt");
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String line;
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		// Updating a file
		try {
			FileWriter writer = new FileWriter("rao.txt", true);
			writer.write("\nAppended text is added.");
			System.out.println("");
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		// Deleting a file
		File file = new File("sample.txt");
		if (file.delete()) {
			System.out.println("File deleted Successfully: " + file.getName());
			System.out.println("");
		} else {
			System.out.println("Not Successful");
			System.out.println("");
		}
	}
}
