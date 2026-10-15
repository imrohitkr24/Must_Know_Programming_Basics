//Sum of Number From 1 to N
import java.util.*;
public class SumOfNum{
    public static void main(String[]args){
        System.out.println("Enter the Number :");
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1; i<=n; i++){
            sum += i;
        }
        System.out.println("Sum of Number is : " + sum);
    }
}