//Find the number which is given to the computer is even or odd
import java.util.*;
public class EvenOdd{
    public static void main(String[]args){
        System.out.println("Enter the Number for Checking : ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a==0){
            System.out.println("Number is Zero");
        }
        else if(a%2==0){
            System.out.println("Number is Even ");
        }else {
            System.out.println("Number is Odd ");
        }
    }
}