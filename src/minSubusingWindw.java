
public class minSubusingWindw {

	public static void main(String[] args) {
		String str = "abbcbaba";
		
		
int[] charArray = new int[256];
//initial pointer left, right
int left = 0;
int right = 0;

int maxLength = 0;


while (right <= str.length()-1) {
	
	int rightCharAscii = str.charAt(right);
	if (charArray[rightCharAscii] == 0) {
		charArray[rightCharAscii]++;
		maxLength = Math.max(maxLength, right-left+1);
		right++;
	} else {
		int leftCharAscii = str.charAt(left);
		left++;
		charArray[leftCharAscii]--;
	}
}

System.out.println("Longest non repeating length is: " + maxLength);
	}

}
