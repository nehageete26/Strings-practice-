class Solution {
    public String firstPalindrome(String[] words) {
        for(String s:words){
            char[] arr = s.toCharArray();
            int i = 0, j= arr.length-1;
            boolean flag = true;
            while(i<j){
                if(arr[i] != arr[j])
                {flag = false;
                break;
                }
                i++;
                j--; 
            }
            if (flag == true)
            return s;
        }
        return "";
    }
}