package oops;

public class BOABank extends Bank{
	
	public int CreditCardnum;
	 int AccountNum;
	 
	public void CCBlance() {
		
		System.out.println("Inside CC Blance");
		
		this.CreditCardnum = 1000;
		super.Accountnum = 123456;
		this.Accountnum = 7890;
	
	
	}
	
	public void CloseAccount(int CCAccount) {
		System.out.println("Inside BOABank CloseAccount");
	}
}
