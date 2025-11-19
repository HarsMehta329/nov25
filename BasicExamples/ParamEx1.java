package BasicExamples;

class paramEx1
{
	String stdName;
	int stdRno;
	//String name;
	//int rno;	
		
	void setData(String name, int rno)
	{
		stdName = name;
		stdRno = rno;
		//this.name = name;
		//this.rno = rno;
	}
	void display()
	{
		System.out.println("Student name is " +stdName);
		System.out.println("Student roll no  is " +stdRno);
	}
	public static void main(String[] a)
	{
		paramEx1 ex1 = new paramEx1();
		ex1.setData("Harsh" , 1);
		ex1.display();
	}
}