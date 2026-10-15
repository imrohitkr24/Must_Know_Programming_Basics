//Count how many numbers from 1 to N are divisible by 3
import java.util.*;
public class divide{
public static void main(String[]args){
System.out.println("Enter the Number For Checking the Number is Divisible By 3 Or Not : ");
Scanner sc = new Scanner(System.in);
int count = 0;
int n = sc.nextInt();
for(int i = 1; i<=n; i++){
    if(i%3==0){
        count++;
    }
    
}
System.out.println("Number of count is : " + count);
}
}
