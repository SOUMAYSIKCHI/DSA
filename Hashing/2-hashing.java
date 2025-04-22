import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//Check if there are any two Equal numbers in an array at a distance less than or equal to k 
		int arr[] = {3,1,2,4,5,6,3};
		int k=3;
		//find pairs with valid index<=k and print trur if you find any 1 valid pair 
		//Using HashMap
		//ele-idx
		//3->0
		//1->1
		//2->2
		//3 already exist at index 0 so diff b.w index is 3-0=3<=k so valid pair exist 
		//if it doesnt exist put 3 with updated index;
		
		HashMap<Integer,Integer> mp = new HashMap<>();
		boolean flag = false;
		for(int i = 0; i<arr.length; i++){
		    if(mp.containsKey(arr[i])){
		        int idx = mp.get(arr[i]);
		        if(i-idx<=k){
		            flag = true;
		            break;
		        }else{
		            mp.put(arr[i],i);
		        }
		    }else{
		        mp.put(arr[i],i);
		    }
		}
		
		System.out.println(flag);
		

	}
}
