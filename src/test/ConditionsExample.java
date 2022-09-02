package test;

public class ConditionsExample {

	public static void main(String[] args) {
		

		int age = 15;
		
		if(age>=18) 
		{
			System.out.println("I am elegible for voting");
		}
		else if(age == 17)
		{
			System.out.println("Sorry try again next year");
		}
		else 
		{
			System.out.println("Not elegible for voting");
		}
	}

}
