package hashmap;
import java.util.*;
public class Intersection_Of_Two_Array {

	public static void main(String[] args) {
		int[] nums1 = {2,3,5,4,8,7,2,3,4};
		int[] nums2 = {3,4,2,2,3,7,7,6,2,9};
		  HashMap<Integer, Integer> map = new HashMap<>();
	        for(int i =0; i< nums1.length; i++){
	            if(map.containsKey(nums1[i])){
	            	map.put(nums1[i], map.get(nums1[i])+1);

	            }
	            else{
	                map.put(nums1[i], 1);
	            }
	        }
	        List<Integer> ll = new ArrayList<>();
	        for(int i =0; i<nums2.length; i++){
	            if(map.containsKey(nums2[i]) && map.get(nums2[i]) > 0){
	                ll.add(nums2[i]);
	                map.put(nums2[i], map.get(nums2[i])-1);
	            }
	        }
	        int[] ans = new int[ll.size()];
	        for(int i =0; i<ans.length; i++){
	            ans[i] = ll.get(i);
	        }
	        for(int i =0; i<ans.length; i++) {
	        	System.out.print(ans[i]+" ");
	        }
		
		// TODO Auto-generated method stub

	}

}
