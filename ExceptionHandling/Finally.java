import java.util.Scanner;

public class Finally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("enter n");

		int n = sc.nextInt();
		try {
		int ans=n/0;
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		finally {
			sc.close();
		}
		System.out.println("closed");
	}

}
