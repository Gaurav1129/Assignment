// Third Question

import java.util.HashSet;

public class pangram {

    public static void main(String[] args) {
        String input = "The quick brown fox jumps over the lazy dog";

        // Method to check if input string is pangram or not
        boolean isPangram = checkIfPangram(input);
        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }

    public static boolean checkIfPangram(String s) {

        s = s.toLowerCase();

        HashSet<Character> characters = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isLetter(c)) {
                characters.add(c);
            }
        }

        // Check if the HashSet size is 26 (all letters from a-z)
        return characters.size() == 26;
    }
}
