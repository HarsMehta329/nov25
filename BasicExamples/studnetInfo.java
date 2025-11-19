package BasicExamples;

class studnetInfo
{
		String name ="Harsh";
		String middleName="DharmendraBhai";
		String surName="Mehta";
		String birthDate =" 5 September 2002";
		String address = "B-4 Akshartirth Apartment Raiya road Rajkot";
		int rollNo=44;
		
		void studentName()
		{
			System.out.println(""+name);
			System.out.println(""+middleName);
			System.out.println(""+surName);		
		}
		void studentOtherDetails()
		{
			System.out.println(""+birthDate);
			System.out.println(""+address);
			System.out.println(""+rollNo);
		}	
		public static void main(String[] args)
		{
			studnetInfo s = new studnetInfo();
			s.studentName();
			s.studentOtherDetails();
		}  
}