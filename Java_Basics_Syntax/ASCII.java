import java.util.Scanner;

public class ASCII {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a character: ");
        // Read the input string and take the first character
        char ch = scanner.next().charAt(0);
        
        // Explicitly cast the character to an integer to get its ASCII value
        int ascii = (int) ch;
        
        System.out.println("The ASCII value of '" + ch + "' is: " + ascii);
        
        // Close the scanner to prevent memory leaks
        scanner.close();
    }
}
