class BankDetails
{
	int bal = 1500;
	
	void debitAmt()
	{
		bal = bal - 500;
	}	
	void creditAmt()
	{
		bal = bal + 1000;
	}
	void display()
	{
		System.out.println(bal);
	}	
	public static void main(String[] args)
	{
		BankDetails bankDetails1 = new BankDetails(); 
		bankDetails1.creditAmt();
		bankDetails1.creditAmt();
		bankDetails1.debitAmt(); 
		BankDetails bankDetails2 = new BankDetails(); 
		bankDetails2.debitAmt();
		bankDetails1.display();
		bankDetails2.display();
	}
}