import java.util.Scanner;
import static java.lang.Math.*;
public class StaticDemo{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number for square root:");
        double a=sc.nextDouble();
        System.out.println("Square root:"+sqrt(a));
        System.out.print("Enter base for power:");
        double b=sc.nextDouble();
        System.out.print("Enter exponent:");
        double c=sc.nextDouble();
        System.out.println("Power:"+pow(b,c));
        System.out.print("Enter first number for max and min:");
        int d=sc.nextInt();
        System.out.print("Enter second number:");
        int e=sc.nextInt();
        System.out.println("Maximum:"+max(d,e));
        System.out.println("Minimum:"+min(d,e));
        System.out.print("Enter a number for absolute value:");
        int f=sc.nextInt();
        System.out.println("Absolute:"+abs(f));
    }
}