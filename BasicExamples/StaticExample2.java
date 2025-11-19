package BasicExamples;

class StaticExample2	
{
		int num1 = 1;
		int num2 = 2;
		static int num3 = 5;
		
		
		void processData()
		 {
			num1 = num2;	
			num3 = num3+num1+num2;
		 }
		void Display()
		{
			System.out.println(num3);
		}
		public static void main(String[] args)
		{
			StaticExample2 ex = new StaticExample2();
			ex.processData();
			ex.Display();
			StaticExample2 ex2 = new StaticExample2();		
			ex2.processData();	
			ex2.Display();
			
			
		}
}