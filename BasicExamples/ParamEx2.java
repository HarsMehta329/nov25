package BasicExamples;

class paramEx2
{
	int rno =10;
	String name = "Deepak";
		
	void setData(int rno , String name)
	{
		this.name = name;
		this.rno = rno;
	} 
	void display()
	{
		System.out.println(rno + ":" +name);
	}
	public static void main(String[] args)
	{
		paramEx2 ex2 = new paramEx2();
		ex2.setData(1, "Harsh");
		ex2.display();
		System.out.println(ex2.rno + ":" +ex2.name);
	}	
}