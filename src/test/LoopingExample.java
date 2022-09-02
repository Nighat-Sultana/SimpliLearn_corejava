package test;

public class LoopingExample {

	public static void main(String[] args) {
		
		
		int num =2;
		while(num <=10){
			if(num==6){
			
				num=num+2;
				//continue;
				//break;
			}
			System.out.println(num);
			//num=num+1; //both are same
			//num++;
			num=num+2;
			}
		System.out.println("After while loop");
		
System.out.println("===================");	
	
	//for loop
	for(int index=1;index<=10;index++) {
		if(index==6) {//skip num 6
			continue;
		}
		System.out.println(index);
		}
	
System.out.println("============");

	int[] array1 = {10,20,30,40,50,60};
	for(int num1:array1) 
	{
		System.out.println(num1);
	}
	
System.out.println("============");		
			
	for (int index = 0; index <array1.length; index++) 
		{ 
			System.out.println(array1[index]);
		 }
			 
}
	}

	
