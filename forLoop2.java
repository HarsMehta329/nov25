class forLoop2
{
		void loop(int startRange , int endRange)
		{
			int sum =0;
			for(int index = startRange; index<=endRange ; index++)
			{
				sum +=index;
			}
			System.out.println("Sum of  " +startRange+  " and " + endRange + "is" + sum);
		}
		public static void main(String[] args)
		{
			forLoop2 s1 = new forLoop2();
			s1.loop(10,20);		
		}
}