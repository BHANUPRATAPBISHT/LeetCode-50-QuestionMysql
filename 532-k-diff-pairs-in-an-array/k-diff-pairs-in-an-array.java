import java.util.HashMap;

class Solution {
    public int findPairs(int[] nums, int k) {
        
        if(k < 0) return 0;   // difference cannot be negative
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        // Count frequency
        for(int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        int count = 0;
        
        for(int num : map.keySet()) {
            
            if(k == 0) {
                // For k = 0, frequency must be >= 2
                if(map.get(num) > 1) {
                    count++;
                }
            } 
            else {
                // Check if num + k exists
                if(map.containsKey(num + k)) {
                    count++;
                }
            }
        }
        
        return count;
    }
}
