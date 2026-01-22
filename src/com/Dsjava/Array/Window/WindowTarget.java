package com.Dsjava.Array.Window;

public class WindowTarget {

	public static void main(String[] args) {
int[] arr = {1, 2, 3, 4, 5, 6};
int target = 5;
int range = 3;

int left = 0, right = arr.length-1;

while (left -right +1 > range) {
	if (Math.abs(target - arr[left]) > Math.abs(target - arr[right])) { 
		
		left++;
	} else  {
	right--;;
} 
}
int []res = new int[range];
for (int i=0; i < range; i++) {
	res[i] = arr[left+i];
}
for (int i: res) {
	System.out.print(i +  " ");
}
}

}
