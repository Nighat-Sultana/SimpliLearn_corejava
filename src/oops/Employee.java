package oops;

public class Employee {
	
	//Name, Empid, Department is class level attribute/property belong to the class
	public String Name;
	public int Empid;
	public String Department;
	
	public Employee() {
		System.out.println("Inside Default constructor");
	}
	
	
	/*P1,P2,P3 is method/function level variable. 
	variable only used within method or function level whereas attribute/property are used at the class
	difference between method & function is method does not return any value but function return value.
	*/
	public Employee(String name, int Empid, String Department) {		
		this.Name = name;
		this.Empid = Empid;
		this.Department = Department;
	}
	
		public void Display() {
			
			System.out.println(Name);
			System.out.println(Empid);
			System.out.println(Department);
	}
	
	
	
	
	
	

}
