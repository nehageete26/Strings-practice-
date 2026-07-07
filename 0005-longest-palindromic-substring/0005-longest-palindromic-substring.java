class Solution {
    public boolean ispalindrome(String s , int i, int j){
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)) return false;
            i++;
            j--; 
        }
        return true;
    }
    public String longestPalindrome(String s) {
        int maxi = 0, start = 0, end = 0;
          for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                if(ispalindrome(s,i,j) == true){
                    if((j-i+1) > maxi){
                    maxi = j-i+1;
                    start = i;
                    end = j;
                    }
                }
            }
          }
          return s.substring(start , end+1);
    }
}