/**
 * Given two strings, determine if they are permutations of one
 * another.
 * 
 * @author Lincoln Fraley
 * December 26, 2015
 */
public class CheckPermutations {
		public static boolean check_permutation(String string1, String string2) {
				string1 = string1.replaceAll("\\s+", "").toLowerCase();
				string2 = string2.replaceAll("\\s+", "").toLowerCase();
				if (string1.length() != string2.length()) {
						return false;
				} else {
						for (int i=0; i<string1.length(); i++) {
							if (string2.indexOf(string1.charAt(i))==-1) {
								return false;
							}
						}
						return true;
				}
		}
		
		public static void main(String[] args) {
				String string1 = "Hello";
				String string2 = "world";
				String string3 = "llohe";
				System.out.println("'Hello' and 'world' are permuations: " 
						+ check_permutation(string1,string2));
				System.out.println("'Hello' and 'llohe' are permuations: " + 
						check_permutation(string1,string3));
		}
	}
