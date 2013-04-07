import java.lang.*;
import java.util.Scanner;
import java.rmi.Naming; 

public class Client
{
public static void main(String [] args)
{
try
{
Calculator calc=(Calculator)Naming.lookup("//127.0.0.1/Calcserver");
Scanner s = new Scanner(System.in);
int ch,ch1,ch2,ch3;
int x,y;
float a,b;
char op;
String r,val1;
double val;
int c;
do
{
System.out.println("1.Arithmetic\n2.SCientific\n3.Conversions\n4.Logical\n5.Exit");
ch=s.nextInt();
if(ch==1)
{
do
{
System.out.println("Enter the values");
a=s.nextFloat();
b=s.nextFloat();
System.out.println("Enter the operator");
r=s.next();
op=r.charAt(0);
a=calc.arithmetic(a,b,op);
System.out.println("The retrun value :"+a);
System.out.println("do u wish to continue1.yes\n2.no");
c=s.nextInt();
}while(c==1);
}
if(ch==2)
{
while(true)
{
System.out.println("1.Sine\n2.Cosine\n3.tangent\n4.exit\n");
ch1=s.nextInt();
if(ch1==4)
break;
System.out.println("Enter the value");
val=s.nextDouble();
val=calc.scientific(val,ch1);
System.out.println("The value is: "+val);
}
}
if(ch==3)
{
while(true)
{
System.out.println("1.toBinary\n2.toOctal\n3.toHex\n4.exit\n");
ch2=s.nextInt();
if(ch2==4)
break;
System.out.println("Enter the value");
val1=s.next();
r=calc.conversion(val1,ch2);
System.out.println("The converted value is: "+r);
}
}
if(ch==4)
{
while(true)
{
System.out.println("1.AND\n2.OR\n3.exit\n");
ch3=s.nextInt();
if(ch3==3)
break;
System.out.println("Enter 2 numbers(1/0)");
x=s.nextInt();
y=s.nextInt();
x=calc.logical(x,y,ch3);
System.out.println("The  value: "+x);
}
}
}while(ch!=5);
}
catch (Exception e) {
		System.out.println("\n error"+e.getMessage());

}
}
}
