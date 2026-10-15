//Find the Largest of the Number 
import java.util.*;
public class Largest{
    public static void main(String[]args){
        System.out.println("Enter the Number For Checking : ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a==b){
            System.out.println("A is Equal To B");
        }
        else if(a>b){
            System.out.println("A is greater than B");
        }else{
            System.out.println("B is greater than A");
        }
    }
}