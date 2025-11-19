package BasicExamples;

class Example4
{
	int x = 10;
	int y = 20;
	void ProcessData()
	{	
		int z = x + y;
		x = x + 10;
		y = y + 10; 	
	}
	void display()
	{
		System.out.println("Sum Is : "+ x+y);
		System.out.println(x+y +"is My Answer");
		System.out.println("Sum Is : "+ (x+y));
	}
	public static void main(String[] a)
	{
		Example4 ex = new Example4();
		ex.ProcessData();
		ex.display();
	}
}