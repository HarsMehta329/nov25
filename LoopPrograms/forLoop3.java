package LoopPrograms;

class forLoop3
{
		void loop(int startRange , int endRange)
		{
			int sum =0;
			for(int index = startRange; index<=endRange ; index++)
			{
				if(index % 3 == 0)
				{
					System.out.println("no is Divisible by 3 is: " +index);
				}
			}
		}
		public static void main(String[] args)
		{
			forLoop3 s1 = new forLoop3();
			s1.loop(10,20);		
		}
}