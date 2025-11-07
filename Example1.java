class Example1
{
	int accountNo = 124;
	String name = "Harsh";	
	void processData()
	{
		String Name ="Harsh";
		int accountNo = 567;
		accountNo = 789;
	}
	void printInfo()
	{
		System.out.println(name);
		System.out.println(accountNo);
	}	
	public static void main(String[] args)
	{
		Example1 ex = new Example1();
		ex.processData();
		ex.printInfo();
	}
	
}



