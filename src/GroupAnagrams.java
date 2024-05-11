import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

//https://leetcode.com/problems/group-anagrams/description/
public class GroupAnagrams {

	public List<List<String>> groupAnagrams(String[] strs) {
		HashMap<String, List<String >> map = new HashMap<>();

		for (String str : strs) {
			int[] arr = new int[26];
			for (char c : str.toCharArray()) {
				arr[c-'a']++;
			}
			StringBuilder word = new StringBuilder();
			for (int i =0; i<26; i++) {
				for (int j =0; j < arr[i]; j++) {
					word.append((char)('a'+i));
				}
			}
			if (!map.containsKey(word.toString())){
				map.put(word.toString(),new ArrayList<>());
			}
			List<String> list = map.get(word.toString());
			list.add(str);}
		return new ArrayList<>(map.values());
	}

	public static void main(String[] args) {
		String[] arr = new String[]{"eat","tea","tan","ate","nat","bat"};
		System.out.println(new GroupAnagrams().groupAnagrams(arr));
	}
}
