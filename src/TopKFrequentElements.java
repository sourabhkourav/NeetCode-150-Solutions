import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

//https://leetcode.com/problems/top-k-frequent-elements/
public class TopKFrequentElements {
	public int[] topKFrequent(int[] nums, int k) {
		Map<Integer, Integer> map = new HashMap<>();

		for (int i : nums){
			map.put(i, map.getOrDefault(i, 0) + 1);
		}

		PriorityQueue<Map.Entry<Integer, Integer>> priorityQueue = new PriorityQueue<>((o1, o2) -> o2.getValue() - o1.getValue());
		priorityQueue.addAll(map.entrySet());
		nums = new int[k];

		for (int i=0; i<k; i++) {
			nums[i] = priorityQueue.poll().getKey();
		}

		return nums;
	}

	public static void main(String[] args) {
		int[] nums = new int[]{1,1,1,2,2,3};
		int k = 2;

		System.out.println(Arrays.toString(new TopKFrequentElements().topKFrequent(nums, k)));
	}
}
