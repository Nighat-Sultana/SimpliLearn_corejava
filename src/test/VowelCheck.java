package test;

public class VowelCheck {

	public static void main(String[] args) {
		
		String str = "Clean world Green world";
		System.out.println(str.length());
			int vowelcount = 0;
			int consonantcount = 0;
			
		for(int index = 0; index<str.length(); index++)
		{
			char ch = str.charAt(index);
			
			if(ch =='a'|| ch=='e'|| ch=='i' ||ch=='0' || ch=='u') {
				vowelcount++;
			}else {
				consonantcount++;
			}
				
		}
		
		System.out.println("The vowel count is " +vowelcount);
		System.out.println("The consonent count is "+consonantcount);
		
		
		
		
		
		

	}

}
