package InterfaceDemo;

public class AdvanceCal implements Calc {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Calc obj1= new AdvanceCal();
		obj1.add();
		
		obj1.sub();
		
		
	}
	public void calCos(){
		
		System.out.println("Iam in advancecal cos method");
	}
public void calSin(){
		
		System.out.println("Iam in advancecal sin method");
	}
	public void add() {
		// TODO Auto-generated method stub
		System.out.println("I am in add method");
	}
	public void sub() {
	
System.out.println("I am in sub method");
	}

}
