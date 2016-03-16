/**
 * Return the maximum of two numbers without using any comparison
 * operators.
 * 
 * @author Lincoln Fraley
 * January 16, 2016
 */
public class NumberMax {
		public static int max(int a, int b) {
				return (Math.abs(a-b)+(a+b))/2;
		}
	
	public static void main(String[] args) 
	{
		int a = 7;
		int b = 7;
		
		System.out.println(max(a, b));

	}

}
