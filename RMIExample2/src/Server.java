import java.rmi.Naming;
import java.rmi.RemoteException;
import java.net.MalformedURLException;
import java.rmi.RMISecurityManager;
 
public class Server {
    public static void main(String[] args) {

    	
    	System.setSecurityManager(new RMISecurityManager());
        
        try {
            Calc obj = new CalcImpl();
            Naming.rebind("localhost", obj);
            System.out.println("Server is ready...");
            System.out.println("Waiting for client request...");
        } catch (RemoteException e1) {
            e1.printStackTrace();
        } catch (MalformedURLException e2) {
            e2.printStackTrace();
        }
    }
}
 