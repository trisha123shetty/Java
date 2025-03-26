
public class Bankmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank sbi = new Bank("INR",25000);
		Bank icic = new Bank("INR",3000);
		Bank american = new Bank("USD",2333);
		int result= sbi.add(american);
		System.out.println(result);

	}

}
