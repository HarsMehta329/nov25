class dayIndex 
{
	void processData(int day)
	{
		if(day>=1 && day<=5)
		{
			System.out.println("week day");
		}
		else if(day == 6 || day == 7)
		{
			System.out.println("Weekend");
		}
		else
		{
			System.out.println("Invalid Range");
		}
	}
	public static void main(String[] args)
	{
		dayIndex d = new dayIndex();
		d.processData(87);
	}	
}