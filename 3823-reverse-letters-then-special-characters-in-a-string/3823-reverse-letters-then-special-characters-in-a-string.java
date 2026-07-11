class Solution {
    public String reverseByType(String s) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb1 = new StringBuilder();
        StringBuilder ans = new StringBuilder();
        for(char ch: s.toCharArray()){
            if(Character.isLetter(ch)) sb.append(ch);
            else sb1.append(ch);
        }
        sb.reverse();
        sb1.reverse();
        int i = 0, j=0;
        for(char ch: s.toCharArray()){
            if(Character.isLetter(ch)) ans.append(sb.charAt(i++));
            else ans.append(sb1.charAt(j++));
        }
        return ans.toString();
    }
}