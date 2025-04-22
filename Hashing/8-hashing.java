import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main(String[] args) throws java.lang.Exception
	{
	   //8)Find largest/smallest subarray with sum k in Given Array
		int arr[] = {1,0,1,0,0,2,10,8};  
		int n = arr.length;
		int k = 3;
		
		HashMap<Integer,Integer> mp = new HashMap<>(); //ele,idx
		int presum = 0;
		int maxLen = 0;
		for(int i = 0; i<n; i++){
		    presum = presum+arr[i];
		    if(presum==k){
		        maxLen = Math.max(maxLen,i+1);
		    }
		    if(mp.containsKey(presum-k)){
		        int idx = mp.get(presum-k);
		        maxLen = Math.max(maxLen,i-idx+1);
		    }
		    mp.put(presum,i);
		}
		
		System.out.println(maxLen);
	}
}
