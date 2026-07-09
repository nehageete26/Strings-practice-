class Solution {
    public String makeGood(String s) {
        StringBuilder sb = new StringBuilder();
        char ch[] = s.toCharArray();
        for(int i=0;i<ch.length;i++){
            int n = sb.length();
            if(n > 0 && Character.toLowerCase(sb.charAt(n-1)) == Character.toLowerCase(ch[i]) && sb.charAt(n-1) != ch[i]) sb.deleteCharAt(n-1);
            else sb.append(ch[i]);
        }
        return sb.toString();
    }
}