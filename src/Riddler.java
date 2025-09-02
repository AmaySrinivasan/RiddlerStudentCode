/**
 * The Riddler:
 * A puzzle by Zach Blick
 * for Adventures in Algorithms
 * At Menlo School in Atherton, CA
 *
 * Completed by: Amay Srinivasan
 */
//
public class Riddler {
    // Decrypting the first puzzle
    public String decryptOne(String encrypted) {
        // Start with an empty string to the answer
        String decrypted = "";
        // Loop through the given message
        for (int i = 0; i < encrypted.length(); i++) {
            // Caesar cypher, so shift forward 9 and add to message
            char c = encrypted.charAt(i);
            // Shifting uppercase characters over by 9
            if (Character.isUpperCase(c)) {
                decrypted += (char) ((c - 'A' + 9) % 26 + 'A');
            }
            // Shifting lowercase letters over by 9
            else if (Character.isLowerCase(c)) {
                decrypted += (char) ((c - 'a' + 9) % 26 + 'a');
            }
            // If it's not a letter (like punctuation), stay the same
            else {
                decrypted += c;
            }
        }
        // Return completed decryption
        return decrypted;
    }
    // Decrypting second puzzle
    public String decryptTwo(String encrypted) {
        // Start with empty string for the answer
        String decrypted = "";
        // Array filled with everything but the spaces (each item is a number)
        String[] nums = encrypted.split(" ");
        // Looping through the numbers
        for ( int i = 0; i < nums.length; i++) {
            // Adding the ascii value for the numbers to the decryption
            int ascii = Integer.parseInt(nums[i]);
            decrypted += (char) ascii;
        }
        // Returning the decryption

        return decrypted;
    }
    // Decrypting the third puzzle
    public String decryptThree(String encrypted) {
        // Start with empty string for answer
        String decrypted = "";
        // Move through the string in groups of eight
        for (int i = 0; i < encrypted.length(); i+=8) {
            int c = 0;
            // Move through each group of eight
            for (int j = 0; j < 8; j++) {
                // Use bitwise functions to convert from ascii to letters
                char bit = encrypted.charAt(i+j);
                c = (c << 1) | (bit - '0');
            }
            // Add to decrypted version
            decrypted += (char) c;
        }
        // Return the decrypted function
        return decrypted;
    }
    // Decrypting the fouth puzzle
    public String decryptFour(String encrypted) {
        // Start with an empty answer
        String decrypted = "";
        // Loop through the encrypted puzzle
        for (int i = 0; i < encrypted.length(); i++) {
            // Shift each dingbat emoji via ascii to a letter
            char symbol = encrypted.charAt(i);
            int dingbat = (int) symbol;
            int ascii = (dingbat - 9951) + 32;
            // Add the letter to the decrypted version
            decrypted += (char) ascii;
        }
        // Return the decrypted message
        return decrypted;
    }
}
