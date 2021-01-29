//Minimize the Heights

/*Given an array arr[] denoting heights of N towers and a positive integer K, you have to modify the height of each tower either by increasing or decreasing them by K only once. After modifying, height should be a non-negative integer. 
Find out what could be the possible minimum difference of the height of shortest and longest towers after you have modified each tower.*/

//Links: https://practice.geeksforgeeks.org/problems/minimize-the-heights3351/1#

//Code: 
// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class Main{

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int k = Integer.parseInt(inputLine[0]);
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int ans = new Solution().getMinDiff(arr, n, k);
            System.out.println(ans);
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution {
    int getMinDiff(int[] arr, int n, int k) {
        // code here
       Arrays.sort(arr);
        int minimum;
        int maximum;
        int result=arr[n-1]-arr[0];
        for(int i=1;i<=n-1;i++){
            if(arr[i]>=k){
                maximum=Math.max(arr[i-1]+k,arr[n-1]-k);
                minimum=Math.min(arr[0]+k,arr[i]-k);
                result=Math.min(result,maximum-minimum);
            }
            else {
                continue;
            }
        }
        return result;
    }
}

