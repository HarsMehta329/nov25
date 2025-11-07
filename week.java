class week
{
	void processData(int week)
	{
		if(week ==1)
		{
			System.out.println("Monday");
		}
		else if(week ==2)
		{
			System.out.println("Tuesday");
		}
		else if(week ==3)
		{
			System.out.println("Wednesday");
		}
		else if(week ==4)
		{
			System.out.println("Thrusday");
		}
		else if(week ==5)
		{
			System.out.println("Friday");
		}
		else if(week ==6)
		{
			System.out.println("Saturday");
		}
		else if(week ==7)
		{
			System.out.println("Sunday");
		}
		else
		{
			System.out.println("Invalid Week Days");
		}
	}
	public static void main(String[] args)
	{
		week w = new week();
		w.processData(1);
	}	
}