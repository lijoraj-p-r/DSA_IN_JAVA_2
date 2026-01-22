public class MINSubstringNUmber {
public static void main(String[] args) {
int n = 5; 
int[] arr = new int[n];
int target = 2;
int left = 0, minLength = n;
int sum = 0;

for (int right = 0; right < n ; right++) {
    sum += arr[right];

    while (sum >= target) {
        minLength = Math.min(minLength, right - left + 1);
        sum -= arr[left];
        left++;
    }
}
System.out.println(minLength);
}
}
