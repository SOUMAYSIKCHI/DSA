import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	   // 4q) Count All ((i,j) pairs such that b[i] - b[j] == k (count of such pairs.) [i<j]  
	   
	   //k == arr[i]-arr[j];
	   //k+arr[j]==arr[i];
	  
		
		int arr[] = {1,5,2,4,1};
		int k=3;
		HashMap<Integer,Integer> mp = new HashMap<>();
		int cnt = 0;
		for(int i = 0; i<arr.length; i++){
		    if(mp.containsKey(k+arr[i])){
		        cnt+=mp.get(k+arr[i]);
		    }
		    mp.put(arr[i],mp.getOrDefault(arr[i],0)+1);
		}
		
		System.out.println(cnt);
		

	}
}
