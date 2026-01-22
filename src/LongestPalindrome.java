import java.util.Scanner;

public class LongestPalindrome {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
String s1 = sc.next();
SubFinder(s1);
	}
	//all possible sub string finder
	public static void SubFinder(String s) {
		String larg = "";
	for (int i=0; i<=s.length()-1; i++) {
		for (int j=i+1; j<=s.length(); j++) {
			if(palindromeChecker((s.substring(i, j))) == true) {
				if ( larg.length() < ((s.substring(i, j))).length() && ((s.substring(i, j))).length() >= 3) {
					larg = s.substring(i, j);
				}}}}
	System.out.println(larg);}
	//palindrome checker
	public static boolean palindromeChecker(String s) { 
		int i =0, j = s.length()-1;
		while (i <= j) {
			if (s.charAt(i) != s.charAt(j)) {
				return false;
			}
			i++;
			j--;	
		}
		return true;}}
