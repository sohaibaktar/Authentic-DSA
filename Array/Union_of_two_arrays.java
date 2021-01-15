//Find the Union and Intersection of the two sorted arrays.
//This is only Union
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Union_of_two_arrays {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("test....");
		int t = sc.nextInt();
		
		while(t-->0) {
		
			int n,m;
			n = sc.nextInt();
			
			m = sc.nextInt();
			
			int a[] = new int[n];
			int b[] = new int[m];
			
			for(int i=0;i<n;i++) {
				a[i] = sc.nextInt();
			}
			
			for(int i=0;i<n;i++) {
				b[i] = sc.nextInt();
			}
			System.out.println(doUnion(a,n,b,m));
		}
	}

	public static int doUnion(int[] a, int n, int[] b, int m) {
	Set< Integer > sett = new HashSet<>();
	for (int num: a) sett.add(num);
	for (int num: b) sett.add(num);
	return sett.size();
	}

}
