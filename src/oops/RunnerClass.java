package oops;

public class RunnerClass {
	public static void main(String[]args) {
		
		Employee E1 = new Employee();
		E1.Name = "Mike";
		E1.Empid = 1000;
		E1.Department = "HR";
		E1.Display();
		
		Employee E2 =new Employee("Jack", 1001, "Finance");
		E2.Display();
		
		Bank B = new Bank();
		int Bal = B.GetBlance();
		
		System.out.println("Thai blance is "+B.GetBlance());
		System.out.println("Thai blance is "+Bal);
		
		BOABank B2 = new BOABank();
		B2.CCBlance();
		B2.DisplayBlance();
		
		//overloadingExample
		OverloadingExample obj = new OverloadingExample();
		int RecArea = obj.GetArea(3, 4);
		int SqArea = obj.GEtArea(4);
		System.out.println("RecArea is "+RecArea);
		System.out.println("SqArea is "+SqArea);
		
		//overridingExample
		B2.CloseAccount(123456);
		B.CloseAccount(123456);
		
		Chrome ch = new Chrome();
		
		ch.openBrowser();
		ch.show();
		
		Browser br = new Chrome();
		
		br.openBrowser();
		br.CloseBrowser();
		br.DisplayName();
		
	}
}
