/** 
 * Write a function which computes the number of trailing zeros in
 * n!.
 * 
 * @author Lincoln Fraley
 * January 16, 2016
 */
public class FactorialZeros  {
		public static int zeros(int n) {
				int zeros = 0;
				if (n/5>=0) {
						zeros=(n/5);
				}
				return zeros;
		}
	
	public static void main(String[] args) {
			long n = 1;
			for (int i=1; i<=20; i++) {
					n=n*i;
					System.out.format("%d!: %d; number of zeros: %d%n", i, n, zeros(i));
			}
	}

}
