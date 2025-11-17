class result
{
	void processData(int marks)
	{
		if(marks>=90)
		{
			System.out.println("A+");
		}
		else if(marks>=80)
		{
			System.out.println("A");
		}
		else if(marks>=70)
		{
			System.out.println("B");
		}
		else if(marks>=60)
		{
			System.out.println("c");
		}
		else if(marks<50)
		{
			System.out.println("Fail");
		}
	}
	public static void main(String[] args)
	{
		result Result = new result();
		Result.processData(80);
	}	
}