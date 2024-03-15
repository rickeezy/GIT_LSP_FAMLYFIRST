package org.howard.edu.lsp.midterm.question1;

/**
 * The SecurityOps class provides methods for encrypting text using a simple algorithm.
 * The encryption method writes all even-index characters followed by all odd-index characters,
 * ignoring punctuation and whitespace.
 Rickelle Jones
 */
public class SecurityOps {

    /**
     * Encrypts the given text using a simple encryption algorithm.
     * 
     * @param text The text to be encrypted.
     * @return The encrypted text.
     */
    public static String encrypt(String text) {
        StringBuilder encryptedText = new StringBuilder();
        
        // Iterate over the characters in the input text
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            
            // Check if the character is a letter
            if (Character.isLetter(ch)) {
                // Append even-index characters to the encrypted text
                if (i % 2 == 0) {
                    encryptedText.append(ch);
                }
            }
        }
        
        // Append odd-index characters to the encrypted text
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            
            // Check if the character is a letter
            if (Character.isLetter(ch)) {
                // Append odd-index characters to the encrypted text
                if (i % 2 != 0) {
                    encryptedText.append(ch);
                }
            }
        }
        
        return encryptedText.toString();
    }
}
