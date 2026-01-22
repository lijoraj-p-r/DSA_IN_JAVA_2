package com.Dsjava.Array.Window;

public class FindKclosesetElementWindowProblem {

	public static void main(String[] args) {
int arr[] = { 1, 2, 3, 4, 5};

int closestRating = 3;//number used to obtain close to reference
int targetNumbers = 4;//numbers of close


int left = 0;
int right = arr.length-1;

while (right-left+1 > targetNumbers ) {
	
	if (Math.abs(closestRating - arr[left]) > Math.abs(closestRating - arr[right])) {
		left++;
	} else {
		right--;
	}
}

int []result = new int[targetNumbers];

for (int i =0; i <= result.length-1; i++) {
	result[i] = arr[left+i];
	System.out.println(result[i]);
}
	}

}
