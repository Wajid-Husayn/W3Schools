
public class multi_para {

		  int modelYear;
		  String modelName;

		  public multi_para(int year, String name) {
		    modelYear = year;
		    modelName = name;
		  }

		  public static void main(String[] args) {
			  multi_para myCar = new multi_para(1969, "Mustang");
		    System.out.println(myCar.modelYear + " " + myCar.modelName);
		  }
		}

		// Outputs 1969 Mustang

