/**
 * Question 5.2, Cracking the Coding Interview Edition 2
 * Given a number that is passed in as a string, print the binary
 * representation. If the number can not be represented accurately 
 * in binary, print "ERROR."
 * 
 * @author Lincoln Fraley
 * January 5, 2016
 */
public class BinaryString 
{
	public static void binaryString(String num)
	{
		double decimal = Double.parseDouble(num);
		int integer = (int) (decimal / 1);
		double fraction = ((decimal % 1) * 10);
		System.out.println(fraction);
	}
	
	public static void main(String[] args) 
	{
		String num = "5.7";
		binaryString(num);
	}

}









