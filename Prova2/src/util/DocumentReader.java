package util;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class DocumentReader {

	public ArrayList<String> read(String fileName) {
	
		ArrayList<String> fileLines = new ArrayList<String>();

		try {
			
			FileReader fr = new FileReader(fileName);
			BufferedReader br = new BufferedReader(fr);
			String line = br.readLine();
			while (line != null) {
				fileLines.add(line);
				line = br.readLine();
			}
			
			br.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
	
		} catch (IOException e) {
			e.printStackTrace();
		}
		return fileLines;
	}
}
