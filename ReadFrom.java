/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it252.dataEnter;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
/**
 *
 * @author nicolas
 */
public class ReadFrom {
    

  public String[][] read(String toRead) {

        //file to read
	String file = "/Users/nicolas/Desktop/IT252/"+toRead;
	BufferedReader br = null;
	String line = "";
	String separator = ",";
        String[] storage = {"a"};
        //storage array for read file
        String[][] returnArray = new String[100][100];
        int fileLine = 0;
        int lineRange = 0;
                
        //transfer file data to array until blank space
	try {
            br = new BufferedReader(new FileReader(file));
            while ((line = br.readLine()) != null) {
                    storage = line.split(separator);
                    
                    for (lineRange = 0; lineRange < storage.length; lineRange++){
                        returnArray[fileLine][lineRange] = storage[lineRange];
                    };
                    fileLine += 1;

		}

	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	} finally {
		if (br != null) {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
        //return full array of data
        return returnArray;
  }

}
