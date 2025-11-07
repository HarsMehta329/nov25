class result1
{
	void processData(int marks)
	{
		if(marks>=90 && marks<=100)
		{
			System.out.println("A+");
		}
		else if(marks>0 && marks<90)
		{
			System.out.println("fail");
		}
		else if(marks <=0 || marks>100)
		{
			System.out.println("Invalid Range");
		}
	}
	public static void main(String[] args)
	{
		result1 Result = new result1();
		Result.processData(-1);
	}	
}