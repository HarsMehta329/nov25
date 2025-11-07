class Calculator

{
	int a = 20;
	int b = 10;
	int ans = 0;
	
	void add()
	{
		ans = a+b;
		System.out.println("Sum is "+ans);
	}
	void sub()
	{
		ans = a-b;
		System.out.println("Sum is "+ans);
	}
	void mul()
	{
		ans = a*b;
		System.out.println("Sum is "+ans);
	}
	void div()
	{
		ans = a/b;
		System.out.println("Sum is "+ans);
	}		
	public static void main(String[] args)
	{
		Calculator c = new Calculator();
		c.add();
		c.sub();
		c.mul();
		c.div();
		System.out.println(c);
	}	 
}