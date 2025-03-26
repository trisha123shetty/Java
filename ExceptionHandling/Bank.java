
public class Bank {

	private String BankName;
	private String Currency;
	private int amount;
	public Bank( String currency, int amount) {
		
		
		this.Currency = currency;
		this.amount = amount;
	}
	public String getBankName() {
		return BankName;
	}
	public void setBankName(String bankName) {
		BankName = bankName;
	}
	public String getCurrency() {
		return Currency;
	}
	public void setCurrency(String currency) {
		Currency = currency;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	public int add(Bank bankName) {
		if(!bankName.Currency.equalsIgnoreCase("INR")) {
			try {
			throw new Exception("currency is not matching");
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
		else {
		System.out.println(bankName.amount);
		return bankName.amount+this.amount;
		}
		return 0;
	}
}
