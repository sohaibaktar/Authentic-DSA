
//User function Template for Java

class Solution{
    int middle(int A, int B, int C){
        
        return (A+B+C) - Math.max(Math.max(A,B),C) - Math.min(Math.min(B,C),A);
    }
}
//Wrte Driver Code