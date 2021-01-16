public class Intersection_of_two_array {
 
    
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
			System.out.println(NumberofElementsInIntersection(a,n,b,m));
		}
	}


    //User function Template for Java

public static int NumberofElementsInIntersection (int a[], int b[] , int n, int m)
{
   int count = 0;
   Set<Integer> set = new HashSet<>();
   for (int num : a) set.add(num);
   for (int num : b) {
       if(set.contains(num)) {
           count++;
           set.remove(num);
        }
       }
       return count;
   }

}
