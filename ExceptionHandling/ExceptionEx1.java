
public class ExceptionEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int a=10;
		int b=0;
	try {
		int c=a/b;
		String s=null;
		s.trim();//		

	}
	catch(ArithmeticException | NullPointerException e) {
		System.out.println(e.getMessage());
	}
	
	System.out.println("ll");
		//unchecked exception
		
	}

}
