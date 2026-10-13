//Find the Area and the perimeter of the rectangle
import java. util.*;
public class Perimeter{
    public static void main(String[]args){
        System.out.println("Enter the Number : ");
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int breath = sc.nextInt();

        System.out.println("Area of rectangle : " + length*breath);
        System.out.println("Perimeter of rectangle : " +2*length+breath);
    }

}