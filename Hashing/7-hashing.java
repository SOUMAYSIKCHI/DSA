import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main(String[] args) throws java.lang.Exception
	{
	   //7Q)Find count of number of subarrays with sum ==  k 
		int arr[] = {1,0,1,2,10,8};  
		int n = arr.length;
		int k = 3;
		
		HashMap<Integer,Integer> mp = new HashMap<>();
		int presum = 0;
		int cnt=0;
		for(int i = 0; i<n; i++){
		    presum = presum+arr[i];
		    if(presum==k){
		        cnt++;
		    }
		    if(mp.containsKey(presum-k)){
		        cnt+=mp.get(presum-k);
		    }
		    mp.put(presum,mp.getOrDefault(presum,0)+1);
		}
		
		System.out.println(cnt);
	}
}
