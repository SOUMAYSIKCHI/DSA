import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
//  Number of subarrays whose sum <= K  
// (All numbers in the array>=0) 
// -> [2 1 1 5 8]  
// K = 4 
// There are 6 subarrays whose sum<=K :- [0…0] , [0….1] , [0….2] ,[1…1],[2..2],[1….2] 
        int arr[] = {2,1,1,5,8};
        int cnt = 0;
        long sum = 0;
        int n = 5;
        int k = 5;
        for (int i = 0, j = 0; j<n; j++) {
            sum += arr[j];
            while(sum>k) {
                sum-=arr[i];
                i++;
            }
            cnt += (j-i+1);
        }
 
        System.out.println(cnt);

	}
}
