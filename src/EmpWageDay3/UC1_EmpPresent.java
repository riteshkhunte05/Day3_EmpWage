package EmpWageDay3;

public class UC1_EmpPresent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fulltime=1;
		 
		 double empcheck=Math.floor(Math.random()*10)%2;
		 if(empcheck == fulltime)
		 {
			 System.out.println("Employee is present");
			
		 }
		 else {
			 System.out.println("Employee is absent");
		 }

	}

}
