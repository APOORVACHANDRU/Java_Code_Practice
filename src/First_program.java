
public class First_program {
	static int MyProgram(String name, int x) {
		System.out.println("mymethod"+name);
		return 5+x;
	}
	
	static int plusMethod(int x, int y) {
		  return x - y;
		}

		static double plusMethod(double x, double y) {
		  return x + y;
		}
	public static void main(String[] args) {
		System.out.println(MyProgram("appu",6));
		System.out.println(MyProgram("anu",7));
		
		 // Code here CANNOT use myNum1 before declaring ,*********so no hoisting ***********
		
		
		// overloading : same functionname works differntly when you send different parameters
		  int myNum1 = plusMethod(8, 5);
		  double myNum2 = plusMethod(4, 6);
		  System.out.println("overloading " + plusMethod(4, 6));
		  System.out.println("int: " + myNum1);
		  System.out.println("double: " + myNum2);

	}

}
