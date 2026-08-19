public class PalindromeChecker {

    public static void main(String[] args) {

        String word = "hello";
        String reversed = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed + word.charAt(i);
        }

        System.out.println("Original Word: " + word);
        System.out.println("Reversed Word: " + reversed);

        if (word.equalsIgnoreCase(reversed)) {
            System.out.println("Result: The word is a Palindrome");
        } else {
            System.out.println("Result: The word is not a Palindrome");
        }
    }
}