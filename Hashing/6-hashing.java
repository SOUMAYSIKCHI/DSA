import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main(String[] args) throws java.lang.Exception
	{
	   //6Q) Find Sum of Range  [l……….r] where(l<=r) using Prefix sum. 
		int arr[] = {1,2,3,4,5};  //l = 2 r=4 sum = 12
// 		pref arr = {1,3,6,10,15}
		int n = arr.length;
		int pref[] = new int[n];
		pref[0] = arr[0];
		for(int i = 1; i<n; i++){
		    pref[i]=pref[i-1]+arr[i];
		}
		int l = 2;
		int r = 4;
		System.out.println(pref[r]-pref[l-1]);
	}
}
