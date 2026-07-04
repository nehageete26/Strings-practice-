class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int count = 0,left = 0, right = 0;
        Arrays.sort(g);
        Arrays.sort(s);
        while(left < s.length && right < g.length){
            if(s[left] >= g[right]){
                count++;
                left++;
                right++;
            }
            else{
                left++;
            }
        }
        return count;
    }
}