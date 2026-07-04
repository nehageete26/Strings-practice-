class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxi = 0;
        for(String s:sentences){
            int words= 1;
            for(char ch: s.toCharArray()){
                if(ch == ' ') words++;
            }
            maxi = Math.max(maxi,words);
        }
        return maxi;
    }
}