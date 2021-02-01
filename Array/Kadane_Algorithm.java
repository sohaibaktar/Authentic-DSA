//Given an array arr of N integers. Find the contiguous sub-array with maximum sum.

// { Driver Code Starts
    import java.io.*;

    class Array {
        
        public static void main (String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
            while(t-->0){
                //size of array
                int n = Integer.parseInt(br.readLine().trim());
                int arr[] = new int[n];
                String inputLine[] = br.readLine().trim().split(" ");
                
                //adding elements
                for(int i=0; i<n; i++){
                    arr[i] = Integer.parseInt(inputLine[i]);
                }
                
                Kadane obj = new Kadane();
                
                //calling maxSubarraySum() function
                System.out.println(obj.maxSubarraySum(arr, n));
            }
        }
    }
    
    // } Driver Code Ends
    
    
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
    
    