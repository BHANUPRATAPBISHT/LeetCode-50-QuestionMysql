class Solution {
    public String countAndSay(int n) {
        return rle(n, "1");
    }
    private String rle(int n, String s) {
        if(n == 1) return s;
        StringBuilder str = new StringBuilder();
        for(int i = 0; i < s.length(); i++) {
            int count = 1;
            i++;
            while(i < s.length() && s.charAt(i) == s.charAt(i-1)) {
                count++;
                i++;
            }
            str.append(count).append(s.charAt(i-1));
            i--;
        }
        return rle(n-1, str.toString());
    }
}