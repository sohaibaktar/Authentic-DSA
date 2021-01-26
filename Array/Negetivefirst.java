

import java.util.Arrays;
import java.util.Scanner;

public class NegetiveFirst {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t-->0) {
			int n= sc.nextInt();
			
			int arr[] = new int[n];
			for(int i=0;i<n;i++) {
				arr[i] = sc.nextInt();
			}
			Arrays.sort(arr);
			System.out.print("Array after sorted: ");
			for(int i=0;i<n;i++) {
				System.out.print(arr[i]+" ");
			}
		}
	
	}
}
