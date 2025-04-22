import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	   // Count all the (i,j) Pairs such that b[i] + b[j] == k (count of such pairs.) [i<j] 
	   
	   //we willl use prefix sum technique 
	   //lets assume = {1,2,3,4}  ,k= 3, so at index 1 sum=3 s cnt++ 
	   //then at index 2 sum = 6 so check if (sum-k)exist in map
		
		int arr[] = {1,2,3,4};
		int k=3;
		HashMap<Integer,Integer> mp = new HashMap<>();
		int cnt = 0;
		int sum = 0;
		
		for(int i = 0; i<arr.length; i++){
		    sum = sum+arr[i];
		    if(sum==k){
		        cnt++;
		    }else if(mp.containsKey(sum-k)){
		        cnt+=mp.get(sum-k);
		    }
		    mp.put(sum,mp.getOrDefault(sum,0)+1);
		}
		
		System.out.println(cnt);
		

	}
}
