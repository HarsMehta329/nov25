class bankDetail
{
		int balance = 1000;
		int debitCount = 0;
		int creditCount = 0;	
		
		void debitAmt(int amt)
		{
			balance = balance - amt;
			debitCount ++;
			
		}
		void creditAmt(int amt )
		{
			balance = balance + amt;
			creditCount ++;
		}
		void display()
		{
			System.out.println("Now your current Balance Is:" +balance);
			System.out.println("Total Debit Operations Performed : "+debitCount);
			System.out.println("Total Credit Operations Performed : "+creditCount);
		}	 
		public static void main(String[] args)
		{
			bankDetail b1 = new bankDetail();
			b1.creditAmt(500);
			b1.creditAmt(500);
			b1.debitAmt(400);
			b1.debitAmt(200);
			b1.display();
		}
}