import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] armps) throws java.lang.Exception
	{
	   // Number of pairs whose diff <=K 
        int n = 5;
        int k = 3;
        int[] arr = {2,1,1,5,8};
        int sum = 0;
        long cnt = 0;
        Arrays.sort(arr);
        for (int i = 0, j = 0; j < n; j++) {
            long diff = arr[j]-arr[i];
            while(diff > k) {
                i++;
                diff = arr[j]-arr[i];
            }
            cnt += (j-i+1);
        }
 
        System.out.println(cnt - n);

	}
}
