class primeNumber
{
	
		void prime(int num)
		{
			boolean status = true;
			for(int index =2; index<num/2; index++)
			{
				if(num % index == 0)
				{
					status = false;
					System.out.println(num + " is not a Prime Number ");
					break;
				}

			}
			if(status == true)
			{
				System.out.println(num + " is a prime Number");
			}	
				
		}
		public static void main(String[] args)
		{
			primeNumber p = new primeNumber();
			p.prime(11);
		}	  
}