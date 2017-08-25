
public class Transaction {
	private Account one;
	private Account two;
	private int amountTran;
	
	public Transaction (Account a, Account b, int amt)
	{
		one=a;
		two=b;
		amountTran=amt;
	}
	
	public Account getFirstAccount()
	{
		return one;
	}
	
	public Account getSecondAccount()
	{
		return two;
	}
	
	public int getTranAmt()
	{
		return amountTran;
	}
}
