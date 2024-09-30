package filehandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class WorkingWithFiles {
	public static void main(String[] args) throws IOException{
		String filePath = "C:\\Users\\TOC3KOR\\eclipse-workspace\\LearningJava\\src\\filehandling\\testdata";
		
		try (FileReader reader = new FileReader(filePath)) {
			// file reader reads only one character at a time and returns it's ASCII value
			try {
				System.out.print("FileReader: ");
				int temp = 0;
				while((temp = reader.read()) != -1) {
					System.out.print((char)temp);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			throw e;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println();
		System.out.println();
		
		
		System.out.print("File & Paths: ");
		
		try {
            Path path = Paths.get(filePath);
            // Read all lines from the file
            Files.lines(path).forEach(System.out::println);
        } catch (IOException e) {
            // Handle exceptions
            System.err.println("Error reading the file: " + e.getMessage());
        }
		
		// writing a file
		System.out.println();
		
		System.out.println("----- Writing into a file ------");
		System.out.println();
		String writeFilePath = "C:\\Users\\TOC3KOR\\eclipse-workspace\\LearningJava\\src\\filehandling\\writedata";
		
		try (FileWriter writer = new FileWriter(writeFilePath)) {
			try {
				writer.write("Hi there! this is a random text file written using java file i/o");
			} catch(IOException e) {
				e.printStackTrace();
			}
			
			writer.close();
		}
		try {
		    Path writtenPath = Paths.get(writeFilePath);
		    // Read all lines from the file
		    Files.lines(writtenPath).forEach(System.out::println);
		} catch (IOException e) {
		    // Handle exceptions
		    System.err.println("Error reading the file: " + e.getMessage());
		}
	}
}
