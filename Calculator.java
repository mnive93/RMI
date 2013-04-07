import java.rmi.*;
public interface Calculator extends Remote
{
public float arithmetic(float a , float b,char op)throws RemoteException;
public String conversion(String val,int ch)throws RemoteException;
public double scientific(double val,int ch) throws RemoteException;
public int logical(int x ,int y ,int ch) throws RemoteException;
}


