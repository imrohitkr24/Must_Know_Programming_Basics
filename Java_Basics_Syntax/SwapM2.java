//Swap the number without the help of temp variables 
import java.util.*;
public class SwapM2{
    public static void main(String[]args){
        int a = 10;
        int b = 12;
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println(a+ " " + b);
    }
}