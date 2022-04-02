import java.util.*;
public class Factorial
{
public static void main(String args[])
{
int num , factorial = 1;
System.out.println("Enter a number : ");
Scanner s = new Scanner(System.in);
num = s.nextInt();

while(num>0)
{
factorial = factorial*(num);
num--;
}
System.out.println("Factorial of the number is "+factorial+".");
}
}