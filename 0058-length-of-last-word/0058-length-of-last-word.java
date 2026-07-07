class Solution {
    public int lengthOfLastWord(String s) {
        String string = s.trim();
        int count = 0;
        int i = string.length()-1;
        while(i >= 0 && string.charAt(i) != ' '){
           count++;
           i--;
        }
        return count;
    }
}