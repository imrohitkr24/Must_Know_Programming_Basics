//Print the NUmber From 1 TO N 
import java.util.*;
public class OnetoN{
    public static void main(String[]args){
        System.out.println("ENter the Number :");
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        for(int i = 1 ; i<=n; i++){
            System.out.println(i + " ");
        }
    }
}