import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] armps) throws java.lang.Exception
	{
       
        int n = 5;
        int k = 3;
        int[] arr = {2,1,1,5,8};
        int cnt = 0;
        int sum = 0;
        Map<Integer, Integer> mp = new HashMap<>();
        for (int i = 0, j = 0; j < n; j++) {
            mp.put(arr[j], mp.getOrDefault(arr[j],0)+1);
            int size = mp.size();
            while(size>k){
                mp.put(arr[i], mp.get(arr[i])-1);
                if(mp.get(arr[i])==0) {
                    mp.remove(arr[i]);
                }
                i++;
                size = mp.size();
            }
            cnt+=(j-i+1);
        }
        System.out.println(cnt);

	}
}
