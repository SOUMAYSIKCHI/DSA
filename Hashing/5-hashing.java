import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main(String[] args) throws java.lang.Exception
	{
	   //5Q) Count all i,j pairs where i<j and abs(b[i]-b[j]) = k [k>=0]  
		int arr[] = {1,5,3,4,2};
		int k=2;
		//valid pairs ->(1,3),(5,3),(4,2);
		//abs(a[i]-a[j])==k
		// a[i]==k+a[j];
		//ele,cnt
		//1,1
		//5,1
		//3,1 // 3+2==5 cnt++
		//4,1 
		//2,1 //2+2==4 cnt++;
		//we get count ==2 but ans is 3 so it doesnt work
		//so smtng is wrong
		//if first value is greater then second then its normal expresion
		//but if the value is negative ie first value< second vlaue ie 2-5 
		//so -a[i]+a[j]=k
		//ie a[i]=a[j]-k;
		
		HashMap<Integer,Integer> mp = new HashMap<>();
		int cnt = 0;
		for(int i = 0; i<arr.length; i++){
		    if(mp.containsKey(arr[i]+k)){
		        cnt+=mp.get(arr[i]+k);
		    }
		    if(mp.containsKey(arr[i]-k)){
		        cnt+=mp.get(arr[i]-k);
		    }
		    mp.put(arr[i],mp.getOrDefault(arr[i],0)+1);
		}
		System.out.println(cnt);
	}
}
