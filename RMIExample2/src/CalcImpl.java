import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
 
public class CalcImpl extends UnicastRemoteObject implements Calc{
 
	protected CalcImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}
 
	@Override
	public int sum(int x, int y) throws RemoteException {
		// TODO Auto-generated method stub
		return x+y;
	}
 
	@Override
	public int sub(int x, int y) throws RemoteException {
		// TODO Auto-generated method stub
		return x-y;
	}
 
	@Override
	public int mul(int x, int y) throws RemoteException {
		// TODO Auto-generated method stub
		return x*y;
	}
 
}