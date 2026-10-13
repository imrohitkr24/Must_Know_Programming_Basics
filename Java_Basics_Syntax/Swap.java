//Swap two number with the help of temp variable
import java.util.*;
public class Swap{
    public static void main(String[]args){
        int a = 10;
        int b = 12;

        int temp = a;
        a = b;
        b= temp;

        System.out.println("A is 10 and B is 12 before swap");
        System.out.println(a +" "+ b);
    }
}
