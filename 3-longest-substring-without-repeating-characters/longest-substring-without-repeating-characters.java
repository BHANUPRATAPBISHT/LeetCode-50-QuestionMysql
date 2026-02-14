import java.util.HashMap;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        HashMap<Character, Integer> map = new HashMap<>();
        
        int i = 0;      // left pointer
        int maxLen = 0;
        
        for(int j = 0; j < s.length(); j++) {   // right pointer
            
            char ch = s.charAt(j);
            
            // If character already seen
            if(map.containsKey(ch)) {
                i = Math.max(i, map.get(ch) + 1);
            }
            
            map.put(ch, j);   // store latest index
            
            maxLen = Math.max(maxLen, j - i + 1);
        }
        
        return maxLen;
    }
}
