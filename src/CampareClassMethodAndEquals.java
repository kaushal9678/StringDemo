/**
 * 
 */

/**
 * @author kaushlendra this class defines difference between == and String class
 *         method equals().
 */

public class CampareClassMethodAndEquals {

	/**
	 * @param args
	 *            == operator when used with objects it compares the value of
	 *            refrences not the contents of objects. and String class
	 *            equals() method is used to compare the contents of objects
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char arrayOfCharacters[] = { 'A', 'B', 'C', 'D', 'E', 'F' };
		byte b[] = { 65, 66, 67, 68, 69, 70 };
		String Str1 = new String(arrayOfCharacters);
		String Str2 = new String(b);
		System.out.println(Str1);
		System.out.println(Str2);
		System.out.println(Str1 == Str2);// here object refrences are compare.
		
		System.out.println(Str1.equals(Str2));// now here object contents are compare
	}

}
