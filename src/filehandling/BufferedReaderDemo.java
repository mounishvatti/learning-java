package filehandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class BufferedReaderDemo {
	public static void main(String[] args) throws Exception {
		String path = "C:\\Users\\TOC3KOR\\eclipse-workspace\\LearningJava\\src\\filehandling\\testdata";
		try {
			FileReader reader = new FileReader(path);
			BufferedReader br = new BufferedReader(reader);
			System.out.println(br.readLine());
			
			String line = null;
			
			while((line = br.readLine()) != null) {
				System.out.print(line);
			}
			br.close();
			
		} catch(FileNotFoundException e) {
			System.out.println("The path to the file is unresolved or is not correct");
		}
	}
}
