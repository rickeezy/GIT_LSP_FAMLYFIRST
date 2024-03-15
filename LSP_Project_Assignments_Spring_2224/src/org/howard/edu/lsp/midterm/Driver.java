package org.howard.edu.lsp.midterm.question1;

/**
 * The Driver class contains the main method to demonstrate the usage of the SecurityOps class.
 Rickelle Jones
 */
public class Driver {
    
    /**
     * The main method of the Driver class.
     * This method demonstrates the usage of the SecurityOps class by encrypting a sample input text.
     * 
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {
        // Input text to be encrypted
        String inputText = "I love CSCI363";
        
        // Encrypt the input text using the SecurityOps class
        String encryptedText = SecurityOps.encrypt(inputText);
        
        // Display the encrypted text
        System.out.println("Encrypted text: " + encryptedText);
    }
}
