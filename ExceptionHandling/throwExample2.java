
public class throwExample2 {

	public static void validateage(int age) {
		if(age<18) {
			try {
			throw new Exception("Minor are not allowed");
			}
			catch(Exception e) {
				throw new RuntimeException(e);
			}
		}else {
			System.out.println("allowed");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		validateage(5);

	}

}
