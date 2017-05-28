package InterfaceDemo;

public class AdvanceCal2 implements Calc {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdvanceCal2 obj1= new AdvanceCal2();
		obj1.add();
		obj1.calCos();
		obj1.calSin();
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
