import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		//Maximum subarray sum:
		int arr[] = {1,-2,-3,-5,8,9,10};
    	int maxSum = arr[0];
        int currentSum = arr[0];
    
        for(int i = 1; i < arr.length; i++) {
            currentSum = Math.max(arr[i], currentSum + arr[i]);
            maxSum = Math.max(maxSum, currentSum);
        }
		System.out.println(maxSum);

	}
}
