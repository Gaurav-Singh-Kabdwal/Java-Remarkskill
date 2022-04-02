import java.util.*;
public class CheckAge
{
public static void main(String args[])
{
int age;
Scanner s = new Scanner (System.in);
System.out.println("Enter your age : ");
age = s.nextInt();
if(age<12)
{
System.out.println("You are MINOR.");
}
else if(age>12&&age<17)
{
System.out.println("You are TEENAGER.");
}
else if(age>17)
{
System.out.println("Congratulations you can VOTE.");
}
}
}