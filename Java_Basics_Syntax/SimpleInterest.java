//Find the Simple interest of the problem 
import java.util.*;
public class SimpleInterest{
    public static void main(String[]args){
        System.out.println("Enter the Numbers : ");
        Scanner sc = new Scanner(System.in);
        float r = sc.nextFloat();
        float p = sc.nextFloat();
        float t = sc.nextFloat();

        float SI = (p*r*t)/100;
        System.out.println("Simple Interest is : " + SI);
    }
}