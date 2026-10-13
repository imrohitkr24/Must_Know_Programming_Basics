//Calculate the sum and product and quotient of two number in java
import java.util.*;
public class Arithmetic_operators{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = a+b;
        int mul = a*b;
        int div = a/b;
        int mod = a%b;

        System.out.println(sum);
        System.out.println(mul);
    }
}
