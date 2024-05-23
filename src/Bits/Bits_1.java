package Bits;
import java.util.*;
public class Bits_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        System.out.println("Enter the Bit position : ");
        int i = sc.nextInt();
        int st= 1<<i-1;
        if((st & num)==0){
            System.out.println("Bit at position "+i+" in "+num+" is "+"0");
        }
        else{
            System.out.println("Bit at position "+i+" in "+num+" is "+"1");
        }
    }    
}
