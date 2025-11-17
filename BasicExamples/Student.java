class Student
{
	String name = "Harsh";
	int rno = 1;
	
	void Display()
	{
	
		System.out.println("My Name is "+name); 
		System.out.println("My Roll No is "+rno);
	}
		
		public static void main(String[] args)
		{
			Student s1 = new Student();
			s1.Display();	
		}
}