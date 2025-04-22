import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main(String[] args) throws java.lang.Exception
	{
	   //Problem Link - https://leetcode.com/problems/valid-anagram/
	   //Observation - The Number of times a Particular Character is coming in String 1, Same no. of times it should come in string 2 also.

		//Understanding of the Problem → We want to check if count of all characters is Equal in both Strings, then these strings will be called Anagrams
		String s = "anagram";
		String t = "nagaram";
		boolean flag = true;
		if(s.length() != t.length()) {
		    flag= false;
		}
        Map<Character, Integer> mp = new HashMap<>();
        int n = s.length();
        for(int i = 0; i < n; i++) {
            mp.put(s.charAt(i), mp.getOrDefault(s.charAt(i), 0) + 1);
            mp.put(t.charAt(i), mp.getOrDefault(t.charAt(i), 0) - 1);
        }
        for(int cnt : mp.values()) {
            if(cnt != 0) {
                flag =false;
            }
        }

        

	}
}
