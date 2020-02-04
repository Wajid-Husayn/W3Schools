
public class objtwice {
	
		  int x = 5;

		  public static void main(String[] args) {
			 objtwice myObj1 = new objtwice();  // Object 1
			 objtwice myObj2 = new objtwice();  // Object 2
		    myObj2.x = 25;
		    System.out.println(myObj1.x);  // Outputs 5
		    System.out.println(myObj2.x);  // Outputs 25
		  }
		
	}
