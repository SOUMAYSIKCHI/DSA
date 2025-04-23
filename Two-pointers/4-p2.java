import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] armlens) throws java.lang.Excelention
	{
	   // Given an array of all integers>=0 -> find the largest subarray whose sum is <= k 
        int n = 5;
        int k = 3;
        int[] arr = {2,1,1,5,8};
        long len = 0;  
        long sum = 0;  
        int i = 0;  
        for(int j = 0; j < n; j++) {
            sum += arr[j];  
            while(sum>k) {
                sum -= arr[i];
                i++;
            }
            long length = j-i+1;
            len = Math.max(len, length);
        }
         System.out.println(len);

	}
}
