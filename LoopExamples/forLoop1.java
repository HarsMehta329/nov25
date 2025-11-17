class forLoop1
{
		void loop(String name)
		{
			for(int index = 1; index<=5 ; index++)
			{
				System.out.println(+index+ ":" +name);
			}
		}
		public static void main(String[] args)
		{
			forLoop1 s1 = new forLoop1();
			s1.loop("Harsh");		
		}
}