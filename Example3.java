class Example3
{
	int bal = 10000;
	void debAmt()
	{	
		bal = bal -2000;	
	}
	void creditAmt()
	{
		bal = bal +1000;
	}
	void display()
	{
		System.out.println("Now Balance Is : "+bal);
	}
	public static void main(String[] a)
	{
		Example3 ex = new Example3();
		ex.creditAmt();
		ex.display();
		ex.debAmt();
		ex.display();
		ex.creditAmt();
		ex.creditAmt();
		ex.debAmt();
		ex.display();
	}
}