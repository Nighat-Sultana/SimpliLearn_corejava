package test;

public class PrimeNumCheck {

	public static void main(String[] args) {
		
		
		int num = 13;
		boolean flag = true;
		
		for(int index=2; index<num; index++)
		{
			int remainder = num%index;
			if(remainder==0)
			{
				System.out.println("Num is not prime");
				flag = false;
				break;
			}
			
		}
		if(flag ==true)
		{
			System.out.println("Num is prime");
		}
		
		
		
		
		
		

	}

}
