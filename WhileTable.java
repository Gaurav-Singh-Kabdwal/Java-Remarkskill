import java.util.*;
public class WhileTable
{
public static void main(String args[])
{
int num, i=1;
System.out.println("Enter a  you want multiplication table of : ");
Scanner s = new Scanner(System.in);
num = s.nextInt();

while(i<=10)
{
System.out.println(num+"*"+i+"="+num*i);
i++;
}
}
}