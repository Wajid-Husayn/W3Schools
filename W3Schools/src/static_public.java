//An example to demonstrate the differences between static and public methods:
public class static_public {

		  // Static method
		  static void myStaticMethod() {
		    System.out.println("Static methods can be called without creating objects");
		  }

		  // Public method
		  public void myPublicMethod() {
		    System.out.println("Public methods must be called by creating objects");
		  }

		  // Main method
		  public static void main(String[] args) {
		    myStaticMethod(); // Call the static method
		    //myPublicMethod(); This would compile an error

		    static_public myObj = new static_public(); // Create an object of MyClass
		    myObj.myPublicMethod(); // Call the public method on the object
		  }
		}

