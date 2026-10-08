package hashmap;
import java.util.*;
public class Ques2_MinimumSumPair {
	public static int sum_pair(int[] arr) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for(int i =0;  i<arr.length; i++) {
			pq.add(arr[i]);
		}
		int sum =0;
		while(pq.size()>1) {
			int a = pq.poll();
			int b = pq.poll();
			pq.add(a+b);
			sum+=a+b;
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n];
		for(int i =0; i<arr.length; i++) {
			arr[i] = scan.nextInt();
			
		}
		System.out.println(sum_pair(arr));
	}
	

}
