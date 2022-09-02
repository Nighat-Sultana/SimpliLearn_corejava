package test;

public class ReversExample {

	public static void main(String[] args) {
		
		String str = "Clean world Green world";
		
		String result = "";
		
		for(int index = str.length()-1; index>=0; index--) {
			char ch = str.charAt(index);
			result = result + ch;
		}
		
		System.out.println("The result srting is: "+ result);
		
		
		/* /Only perform the division operation in mathematics and returns results as the quotient, 
		while % is known as modulus and returns results as the remaining part performed.*/
		
		
		int num = 456789;
		int results = 0;
		
		while(num>0){
		int reminder = num%10; //get reminder
		results = results*10 + reminder; //we need multiply the result by 10 and then append the reminder
		num = num/10; //get next number
		}
		System.out.println();
		System.out.println("The resultd num is "+ results);
		
	}
	
}

