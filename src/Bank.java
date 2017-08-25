import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.concurrent.ArrayBlockingQueue;


public class Bank {
	private static int numOfWorkers=3; 
	private static ArrayBlockingQueue<Transaction> queue = new ArrayBlockingQueue<Transaction>(100);
	private static Account [] acc = new Account [20];//make array with 20 accounts
	public static void main (String args []) throws FileNotFoundException, InterruptedException
	{
		for (int x = 0; x<numOfWorkers; x++)
		{
		 (new Thread(new Worker())).start();
		}
		Scanner scan = new Scanner(new File("small.txt"));
		ArrayBlockingQueue<Transaction> queue = new ArrayBlockingQueue<Transaction>(100);
		for (int x = 0; x<20; x++)
		{
			acc[x]= new Account(x);
		}
		while (scan.hasNext())
		{
			Account one = new Account (scan.nextInt());
			Account two = new Account (scan.nextInt());
			Transaction temp = new Transaction (one, two, scan.nextInt());
			queue.put(temp);
		}
	}
	
	private class Worker implements Runnable
	{
		public void run() {
			while (true)
			{
				try {
					Transaction temp = queue.take();
					temp.getFirstAccount().changeBal(-(temp.getTranAmt()));
					temp.getSecondAccount().changeBal((temp.getTranAmt()));
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		}

		
	}

}

 