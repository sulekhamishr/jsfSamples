import java.rmi.Naming;
import java.util.Scanner;
 
public class Client {
	
	public static void main(String[] args) {
		int a,b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers");
		a = sc.nextInt();
		b = sc.nextInt();
		
		try {
			Calc obj = (Calc)Naming.lookup("localhost");
			System.out.println(obj.sum(a, b));
			System.out.println(obj.sub(a, b));
			System.out.println(obj.mul(a, b));
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
 
}
 