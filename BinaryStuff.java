import java.util.*;

public class BinaryStuff 
{
	public static void main (String[] args)
	{
		double num = 1.5625;
		binaryDecimal(num);
	}
	
	public static void binaryInteger(int decimal)
	{
		int byteInteger = 0b0;
		int powerOfTwo = 0;
		
		while (decimal != 0)
		{
			byteInteger = byteInteger * 2;
			byteInteger = (int) (byteInteger + (decimal % 2) * Math.pow(2, powerOfTwo));
			powerOfTwo++;
			decimal = decimal / 2;
		}
		
		System.out.println(Integer.toBinaryString(byteInteger));
	}
	
	public static void binaryDecimal(double num)
	{
		double fraction = num % 1;
		int powerOfTwo = 0;
		int binary = 0;
		
		while (fraction != 0)
		{
			fraction = fraction * 2;
			
			if (fraction >= 1)
			{
				binary = (int) (binary + (1 * Math.pow(2, powerOfTwo)));
			}
			
			powerOfTwo++;
			fraction = fraction % 1;
		}
		
		String binaryString = Integer.toBinaryString(binary);
		binaryString = new StringBuilder(binaryString).reverse().toString();
		System.out.println(binaryString);
	}
}






