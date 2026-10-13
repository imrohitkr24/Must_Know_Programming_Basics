//changing the temp to C to F and then  F to C
import java.util.*;
public class CtoF_FtoC{
    public static void main(String[]args){
        System.out.println("Enter the Number in C : ");
        Scanner sc = new Scanner(System.in);
        float c = sc.nextFloat();
        System.out.println("Enter the Number in F : ");
        float f = sc.nextFloat();

        float c_change = (c*9/5) + 32;
        float f_change = (f - 32 ) *5/9;

        System.out.println("C to F : " + c_change);
        System.out.println("F to C : " + f_change);

    }
}