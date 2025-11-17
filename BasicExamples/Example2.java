class Example2
{
	int bal = 1000;
	void debAmt()
	{
		int bal = 3000;	
		bal = bal -2000;
		System.out.println(bal);	
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
		Example2 ex = new Example2();
		ex.creditAmt();
		ex.debAmt();
		ex.display();
	}
}