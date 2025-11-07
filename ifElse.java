class ifElse
{
	void processData(int dayIndex)
	{
		if(dayIndex >= 1 && dayIndex <=5)
		{
			System.out.println("its a weekday");
			if(dayIndex ==1)
			{
				System.out.println("Monday");
			}
			else if(dayIndex ==2)
			{
				System.out.println("Tuesday");
			}
			else if(dayIndex ==3)
			{
				System.out.println("Wednesday");
			}	
			else if(dayIndex ==4)
			{
				System.out.println("Thursday");
			}
			else if(dayIndex ==5)
			{
				System.out.println("Friday");
			}
		}
		else if(dayIndex >=6 && dayIndex <=7)
		{
			System.out.println("Its Weekend");
			if(dayIndex ==6)
			{
				System.out.println("Saturday");
			}	
			else if(dayIndex ==7)
			{
				System.out.println("Sunday");
			}
		}	
		else
		{
			System.out.println("Invalid");
		}
	}
	public static void main(String[] a)
	{
		ifElse el = new ifElse();		
		el.processData(1);
	}	
}