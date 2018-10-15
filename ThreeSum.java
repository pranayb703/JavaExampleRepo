/*
 Given an array S of n integers, are there elements a, b, c in S such that a + b + c = 0? 
 Find all unique triplets in the array which gives the sum of zero.
 */
import java.util.*;

public class ThreeSum {
	public static void main(String args[]){
		int numbers[] = {0 , 0 ,  1, 2, 1, 4};
		int sum = 99 ;
		List<List<Integer>> result =  new ArrayList<List<Integer>>();
		result = threeSum(numbers,sum);
		if(result.size() == 0)
			System.out.println("No numbers add up to "+ sum);
		for(int i = 0 ; i < result.size() ; i++){
			System.out.println(result.get(i));
		}
	}
	
	static List<List<Integer>> threeSum(int[] nums , int sum){
		List<List<Integer>> result =  new ArrayList<List<Integer>>();
		
		if(nums == null || nums.length < 3)
			return result;
		Arrays.sort(nums);
		
		for(int i = 0 ; i < nums.length ; i++){
			if(i == 0 || nums[i] > nums[i-1]){
				int j = i+1;
				int k = nums.length -1 ;
				
				while(j < k){
					if(nums[i] + nums[j] + nums[k] == sum){
						List<Integer> l = new ArrayList<Integer>();
						l.add(nums[i]);
						l.add(nums[j]);
						l.add(nums[k]);
						
						result.add(l);
						
						j++;
						k--;
						
						
						while(j < k && nums[j] == nums[j-1])
							j++;
						while(j<k && nums[k] == nums[k+1])
							k--;
					} else if(nums[i] + nums[j] + nums[k] < sum)
							j++;
					  else
							k--;
				}
			}
		}
		
		
		
		return result;
	}
}
