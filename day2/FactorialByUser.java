import java.util.*;
import java.io.*;
public class FactorialByUser
{
    public static void main(String[] args)
    {
         Scanner s=new Scanner(System.in);
         System.out.println("Enter the Number to which you need to find the factorial:");
         int n=s.nextInt();
         int fact=1;
         for(int i=1;i<=n;i++)
         {
             fact=fact*i;
         }
         System.out.print("Factorial of the given number ");
         System.out.print(n + " is:" +fact);
    }
}