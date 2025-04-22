import java.util.*;
import java.lang.*;
import java.io.*;
//We are given an Array of elebers. We have to find and print any eleber with Maximum Frequency and Minimum Frequency.

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int arr[] = {3,4,3,4,2};
		Map<Integer, Integer> mp = new HashMap<>();
        int maxf = Integer.MIN_VALUE, maxi = arr[0];
        int minf= Integer.MAX_VALUE, mini = arr[0];
 
        for(int i = 0; i < arr.length; i++) {
            mp.put(arr[i], mp.getOrDefault(arr[i], 0) + 1);
        }
 
        for(Map.Entry<Integer, Integer> ele : mp.entrySet()){
            if(ele.getValue()>=maxf){
                maxf=ele.getValue();
                maxi=ele.getKey();
            }
            if(ele.getValue()<=minf){
                minf= ele.getValue();
                mini = ele.getKey();
            }
        }
        System.out.println("ele with max freq is "+maxi);

	}
}
