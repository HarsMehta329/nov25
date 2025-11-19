package BasicExamples;

class StaticExample1
{
		static int x = 10;
		int y = 15;
		
		void processData()
		 {
			x++;	
			y++;
		 }
		void Display()
		{
			System.out.println(x + ":" + y);
		}
		public static void main(String[] args)
		{
			StaticExample1 ex = new StaticExample1();
			ex.processData();
			StaticExample1 ex2 = new StaticExample1();		
			ex2.processData();
			ex.Display();	
			ex2.Display();
			
			
		}
}