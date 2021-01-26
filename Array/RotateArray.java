public class RotateArray {
    
}
class Compute {
    
    public void rotate(long arr[], long n)
    {
        long temp1;
        for(int i=(int)n-1; i>0; i--){
            temp1=arr[i-1];
            arr[i-1]=arr[i];
            arr[i]=temp1;
        }
    }
}