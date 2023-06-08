package fileReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Reader1 {
    
    public static void main(String[] args) {
        String filePath = "C:\\\\Users\\\\thewo\\\\OneDrive\\\\Documents\\\\techfios\\\\Selenium Class\\\\dictionary.txt"; // update this with your file path
        if(doesFileExist(filePath)) {
            readFromFile(filePath);
        } else {
            System.out.println("File does not exist at the provided path.");
        }
    }

    public static boolean doesFileExist(String filePath) {
        return Files.exists(Paths.get(filePath));
    }

    public static void readFromFile(String filePath) {
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(filePath));
            String line = reader.readLine();
            while (line != null) {
                String[] parts = line.split("-"); // split the line by '-'
                String word = parts[0].trim(); // trim extra spaces
                String[] meanings = parts[1].split(","); // split the meanings by ','
                System.out.println(word);
                for (String meaning : meanings) {
                    System.out.println(meaning.trim()); // print each meaning
                }
                // read next line
                line = reader.readLine();
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
        
    }

	


