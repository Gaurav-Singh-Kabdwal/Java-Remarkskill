import java.util.*;
public class ForTable
{
public static void main(String args[])
{
int num;
System.out.println("Enter a  you want multiplication table of : ");
Scanner s = new Scanner(System.in);
num = s.nextInt();

for(int i=1;i<=10;i++)
{
System.out.println(num+"*"+i+"="+num*i);
}
}
}