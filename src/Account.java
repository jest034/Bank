//make a specific sequence that kills the workers after transactions are done.
//Transcation is a class that the queue stores, creator account to, from, amount, make getters
//Bank is main method
public class Account {
	private int id, bal, numTran;
	public Account (int i)
	{
		id = i;
		bal = 1000;
		numTran = 0;
	}
	public Account (int i, int b, int t)
	{
		id = i; 
		b = bal;
		t = numTran;
	}
	
	public int getID()
	{
		return id;
	}
	
	public int getBal()
	{
		return bal;
	}
	
	public int getNumTran()
	{
		return numTran;
	}
	
	public void changeBal(int b)
	{
		bal+=b;
	}
	
	public void incrementTran()
	{
		numTran++;
	}
	

}

