package test;

public class SwitchExample {

	public static void main(String[] args) {
		
		String str = "Clean world Green world";
		int count = 0;
		
		for(int index = 0; index<str.length(); index++) {
			char ch = str.charAt(index);
			
			
			switch(ch) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				count++;
				break;
			}
		}	
			
			System.out.println("Total vawel is: " +count);
			
			
			
			
		
	}

}
