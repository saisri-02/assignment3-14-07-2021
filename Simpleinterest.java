import java.util.*;
public class Simpleinterest
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
float P,T,R;
System.out.println("Enter P value : ");
P=sc.nextFloat();
System.out.println("Enter T value : ");
T=sc.nextFloat();
System.out.println("Enter R value : ");
R=sc.nextFloat();
System.out.println("Simple Interest = ");
simpleint(P,T,R);
}
static void simpleint(float P,float T,float R)
{
float SI;
SI=(P*T*R)/100;
System.out.println(SI);
}
}


output:

Enter P value : 
200.00
Enter T value : 
5.0
Enter R value : 
3.0
Simple Interest = 
30.0