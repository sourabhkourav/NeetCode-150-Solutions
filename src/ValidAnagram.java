//https://leetcode.com/problems/valid-anagram/
public class ValidAnagram {

	public boolean isAnagram(String s, String t) {
		if(s.length() != t.length()){
			return false;
		}else{
			int[] arr = new int[26];
			for(char c : s.toCharArray()){
				arr[c-'a']++;
			}
			for(char c : t.toCharArray()){
				arr[c-'a']--;
			}
			for(int i : arr){
				if(i != 0){
					return false;
				}
			}
			return true;
		}
	}

	public static void main(String[] args) {
		String s = "anagram";
		String t = "nagaram";

		System.out.println(new ValidAnagram().isAnagram(s,t));
	}
}
