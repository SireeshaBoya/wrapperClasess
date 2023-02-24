package wrapperClasess.com;

public class wrapper {

	public static void main(String[] args) {

		/*
		 * int i=100; // Integer in= new Integer(i); // System.out.println(i+ "  " +in);
		 */
		/*
		 * int i=67; Integer in = Integer.valueOf(i); System.out.println(i+ "   "+in);
		 * 
		 * int i=789; Integer in = i; System.out.println(i+ "   "+in);
		 */
		// second approach object to primitive
		/*
		 * Integer in = new Integer(89); int i=in; int i=in.intValue();
		 * System.out.println(i+ "   "+in);
		 */
// string type to object;;
		/*
		 * String str ="100"; Integer in = new Integer(str); System.out.println(str+
		 * "  "+in);
		 */
		/*
		 * String str ="100"; Integer in = Integer.valueOf(str); System.out.println(str+
		 * "  "+in);
		 */
		
		Integer in = new Integer(100);	
		String str =in.toString();
		System.out.println(str+  "  "+in);
		
		
	}

}
