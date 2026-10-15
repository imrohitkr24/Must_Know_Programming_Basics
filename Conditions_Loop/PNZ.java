//Find the Number is Positive Negative or Zero
import java.util.*;
public class PNZ{
    public static void main(String[]args){
        System.out.println("Enter the Number :");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num>0){
            System.out.println("Number is Positive ");
        }else if(num<0){
            System.out.println("Number is Negative ");
        }else{
            System.out.println("Enter Number is Zero ");
        }
    }
}