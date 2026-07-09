class Solution {
    public int lengthOfLongestSubstring(String s) {
        ArrayList<Character> list = new ArrayList<>();
        int start = 0, end = 0, max_length = 0;
        while(end < s.length()){
            while(list.contains(s.charAt(end))&& start < s.length()){
                list.remove(Character.valueOf(s.charAt(start)));
                start ++;
            }
            list.add(s.charAt(end));
            max_length = Math.max(max_length,list.size());
            end ++;
        }
        return max_length;
    }
}