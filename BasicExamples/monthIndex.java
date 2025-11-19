package BasicExamples;

class monthIndex 
{
	void processData(int month)
	{
		if(month>=1 && month<=3)
		{
			System.out.println("Q1");
		}
		else if(month >=3 && month<=6)
		{
			System.out.println("Q2");
		}
		else if(month >=7 && month<=9)
		{
			System.out.println("Q3");
		}
		else if(month >=10 && month<=12)
		{
			System.out.println("Q4");
		}
		else
		{
			System.out.println("Invalid month Indent");
		}
	}
	public static void main(String[] args)
	{
		monthIndex m = new monthIndex();
		m.processData(10);
	}	
}