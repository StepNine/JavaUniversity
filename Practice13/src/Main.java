public class Main {

    // Method to process a string passed as a parameter
    public static void processString(String input) {
        // Example string: "I like Java!!!"

        // 1. Print the original string
        System.out.println("Original string: " + input);

        // 2. Print the last character
        System.out.println("Last character: " + input.charAt(input.length() - 1));

        // 3. Check if it ends with "!!!" and print the result
        if (input.endsWith("!!!")) {
            System.out.println("The string ends with '!!!'");
        } else {
            System.out.println("The string does not end with '!!!'");
        }

        // 4. Check if it starts with "I like" and print the result
        if (input.startsWith("I like")) {
            System.out.println("The string starts with 'I like'");
        } else {
            System.out.println("The string does not start with 'I like'");
        }

        // 5. Check if it contains "Java" and print the result
        if (input.contains("Java")) {
            System.out.println("The string contains 'Java'");
        } else {
            System.out.println("The string does not contain 'Java'");
        }

        // 6. Replace "Java" with "Python" and print the result
        String replacedString = input.replace("Java", "Python");
        System.out.println("Modified string: " + replacedString);

        // 7. Convert to uppercase and print the result
        String upperCaseString = input.toUpperCase();
        System.out.println("Uppercase string: " + upperCaseString);

        // 8. Extract the word "Java" if it exists and print the result
        if (input.contains("Java")) {
            int startIndex = input.indexOf("Java");
            int endIndex = startIndex + "Java".length();
            String extractedWord = input.substring(startIndex, endIndex);
            System.out.println("Extracted word: " + extractedWord);
        }
    }

    public static void main(String[] args) {
        // Example usage
        String example = "I like Java!!!";
        processString(example);
    }
}
