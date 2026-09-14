class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int i=0 , j = 0 , maxi = 0, len = 0;
        while(j < s.length()){
            if(!set.contains(s.charAt(j))){
                set.add(s.charAt(j));
                j++;
                len = j-i;
                maxi = Math.max(len , maxi);
            }
            else{
                set.remove(s.charAt(i));
                i++;
            }
        }
        return maxi;
    }
}