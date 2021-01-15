import java.io.IOException;
import java.util.*;
import jdk.internal.org.jline.utils.InputStreamReader;

/*Given an array of size N containing only 0s, 1s, and 2s; sort the array in ascending order.


*/

public class Sort_an_array_of_0s_1s_and_2s  {


//User function template for Java

public static void sort012(int a[], int n){
    // code here 
    Arrays.sort(a);
}
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-->0){
            int n = Integer.parseInt(br.readLine().trim());
            int arr[] = new arr[n];
            String inputLine[] = br.readLine().trim().split(" ");
            for(int i=0;i<n;i++){
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            sort012(arr,n);
            StringBuffer str = new StringBuffer();
            for(int i=0;i<n;i++){
                str.append(arr[i]+" ");
            }
            System.out.println();

        }
    } 
}
