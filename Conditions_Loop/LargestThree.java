// Largest of 3 digit Number 
import java.util.*;
public class LargestThree{
    public static void main(String[]args){
        System.out.println("Enter the Numbers : ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a>b&& a>c){
            System.out.println("A is Greater ");
        }else if (b>a&&b>c){
            System.out.println("B is Greater ");
        }else{
            System.out.println("C is Greater ");

        }
    }
}