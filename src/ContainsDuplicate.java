import java.util.HashSet;
//https://leetcode.com/problems/contains-duplicate/
public class ContainsDuplicate {
	public boolean containsDuplicate(int[] nums) {
		HashSet<Integer> list = new HashSet<>();
		for(int i:nums){
			if(list.contains(i)){
				return true;
			}
			list.add(i);
		}
		return false;
	}

	public static void main(String[] args) {
		ContainsDuplicate object = new ContainsDuplicate();
		int[] nums = new int[]{1,2,3,1};
		System.out.println(object.containsDuplicate(nums));
	}
}

