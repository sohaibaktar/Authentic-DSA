//Given an array arr of N integers. Find the contiguous sub-array with maximum sum.
public class Kadane_Algorithm {
    
}
class Kadane{
    
    // Function to find subarray with maximum sum
    // arr: input array
    // n: size of array
    int maxSubarraySum(int arr[], int n){
     int subArray = arr[0];
     int ans = arr[0];
        for(int i = 1; i < n; i++){
            if(arr[i] > subArray+arr[i])
              subArray = arr[i];
            else
                subArray += arr[i];
                ans =Math.max(ans,subArray);
            }
                return ans;
        }

}

