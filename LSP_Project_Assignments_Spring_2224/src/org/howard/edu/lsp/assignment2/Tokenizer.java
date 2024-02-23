package org.howard.edu.lsp.assignment2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;



//Rickelle Jones

public class Tokenizer {

    public static void main(String[] args) {
        // Relative path
        String f_Path = (args.length > 0) ? args[0] : "src/org/howard/edu/lsp/assignment2/werd.txt";
        File file = new File(f_Path);

        try {
            // Initializes a scanner to read the file
            Scanner scanner = new Scanner(file);

            // Echo the entire content of the file
            System.out.println("Echoing content of text file:");
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
            scanner.close(); // Close the scanner after echoing the file

            // Re-initialize the scanner to read the file again for processing
            scanner = new Scanner(file);

            // Initializes a hashset to store unique words
            HashSet<String> uniqueWords = new HashSet<>();

            // Initializes a hashmap to store word counts
            Map<String, Integer> wordCounts = new HashMap<>();

            // Iterate through the file content
            while (scanner.hasNext()) {
                // Read the next word and convert it to lowercase
                String word = scanner.next().toLowerCase();

                // Check if the word length is greater than 3
                if (word.length() > 3) {
                    // If the word is already in the unique words set, update its count in the word counts map
                    if (uniqueWords.contains(word)) {
                        wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
                    } else {
                        // If the word is not in the unique words set, add it to the set and set its count to 1 in the word counts map
                        uniqueWords.add(word);
                        wordCounts.put(word, 1);
                    }
                }
            }
            // Print unique words and their counts
            System.out.println("\nUnique words and counts:");
            for (String word : uniqueWords) {
                System.out.println(word + "\t" + wordCounts.get(word));
            }
            // Close the scanner
            scanner.close();
        } catch (FileNotFoundException e) {
            // Handle the FileNotFoundException by printing the stack trace
            e.printStackTrace();
        }
    }
}