import java.util.*;
public class NumDays
{
public static void main(String args[])
{
int num;
Scanner s = new Scanner (System.in);
System.out.println("Enter any number from 1 to 7 : ");
num = s.nextInt();
switch(num)
{
case 1:
	System.out.println("MONDAY");
	break;
case 2:
	System.out.println("TUESDAY");
	break;
case 3:
	System.out.println("WEDNESDAY");
	break;
case 4:
	System.out.println("THURSDAY");
	break;
case 5:
	System.out.println("FRIDAY");
	break;
case 6:
	System.out.println("SATURDAY");
	break;
case 7:
	System.out.println("SUNDAY");
	break;
default:
	System.out.println("Invalid Entry");
}
}
}