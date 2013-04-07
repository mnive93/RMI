import java.lang.*;
import java.rmi.Naming; 
public class Server
{
public static void main(String[] args)
{
try
{
Naming.rebind("Calcserver",new Calcserver());
System.out.println("Server is ready!\n");
}
catch (Exception e)
{
System.out.println("Error!\n");
}
}

}

