import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {

    public static void main(String[] args) {
        String str = "abcabcbaccab";
        System.out.println(Solution.lengthOfLongestSubstring(str));
    }
    static class Solution{
        public static int lengthOfLongestSubstring(String s){
            Set<Character> set = new HashSet<>();

            int start = 0, end = 0, max=0;

            while(end < s.length()){
                if(set.contains(s.charAt(end))){
                    set.remove(s.charAt(start++));
                }else{
                    set.add(s.charAt(end));
                    max = Math.max(max,end-start+1);
                    end++;
                }
            }
            return max;
        }
    }
}