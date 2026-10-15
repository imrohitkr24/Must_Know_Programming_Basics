//Check weather the Year is Leap Year or Not
import java .util.*;
public class LeapYear {
    public static void main(String[] args) {
        System.out.println("Enter the Year to Check :");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt(); // Change the year to test

        // Core leap year logic
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}
