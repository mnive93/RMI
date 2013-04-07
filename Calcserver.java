import java.rmi.server.*;
import java.rmi.*;
import java.lang.*;
import java.io.*;
public class Calcserver extends UnicastRemoteObject implements Calculator
{
float result;
double res;
String by;
int ans;
public Calcserver()throws RemoteException
{
}
public float arithmetic(float a ,float b , char op) throws RemoteException
{
	if(op=='+')	
	{
	result=a+b;
	}
	else if(op=='-')	
	{
	result=a-b;
	}
	else if(op=='/')	
	{
	result=a/b;
	}
	else if(op=='*')	
	{
	 result=a*b;
	}
	else if(op=='%')	
	{
	result=a%b;
	}
return result;
}
public String conversion(String value,int ch)throws RemoteException
{
if(ch==1)
{
int i = Integer.parseInt(value);  
   by = Integer.toBinaryString(i);

}
else if(ch==2)
{
int i = Integer.parseInt(value);
  by = Integer.toString(i,8);
}
else if(ch==3)
{
int i = Integer.parseInt(value);
  by = Integer.toHexString(i);
}
return by;
}
public double scientific(double val,int ch)throws RemoteException
{
if(ch==1)
res= Math.sin(val);
else if(ch==2)
res= Math.cos(val);
else if(ch==3)
res= Math.tan(val);
return res;
}
public int logical(int a,int b,int ch)throws RemoteException
{
ans=0;
if(ch==1)
ans=(a&b);
else if(ch==2)
ans=(a|b);
return ans;
}

}

