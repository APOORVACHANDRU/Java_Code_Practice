
public class Hello_world {

	public static void main(String[] args) {
		int myIntMinValue = Integer.MAX_VALUE;

		int myIntMaxValue = Integer.MIN_VALUE;

	

		 byte myByteMinValue = Byte.MAX_VALUE;

		 byte myByteMaxValue = Byte.MIN_VALUE;

		 byte a= 127;

		 

		 short myShortMaxValue = Short.MAX_VALUE;

		 short myShortMinValue = Short.MIN_VALUE;

		 

		 long myLongMaxValue = Long.MAX_VALUE;

		 long myLongMinValue = Long.MIN_VALUE;

		 long b = 9223372036854775807L;

		 

		 System.out.println("b"+ b);

		 System.out.println("a"+ a);

		 System.out.println("myIntMinValue"+ myIntMinValue);

		 System.out.println("myIntMaxValue"+ myIntMaxValue);

		 System.out.println("myByteMinValue"+ myByteMinValue);

		 System.out.println("myByteMaxValue"+ myByteMaxValue);

		 System.out.println("myShortMaxValue"+ myShortMaxValue);

		 System.out.println("myShortMinValue"+ myShortMinValue);

         

		 System.out.println("myShortMaxValue"+ myLongMaxValue);

		 System.out.println("myShortMinValue"+ myLongMinValue);

	

		 

		 

		 // autoboxing

		 int x = 56;

		 Integer aObj = x;

		

		 System.out.println("autoboxing"+ aObj);

		 System.out.println("autoboxing"+ aObj instanceof Object);

		 

		 

		 // unboxing

		 int y = aObj;

		 System.out.println("unboxing"+ y);

	}

}
