import java.util.*;
public class ArraySum
{
public static void main(String args [])
{
int size, arr[], sum=0;
Scanner s = new Scanner(System.in);
System.out.println("Enter size of array:");
size = s.nextInt();
arr = new int [size];
System.out.println("Enter array elements:");
for(int i=0;i<size;i++)
{
arr[i] = s.nextInt();
sum += arr[i];
}
System.out.println("Addition of array is:"+sum);
}
}