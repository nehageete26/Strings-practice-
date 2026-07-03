class Solution {
    public int lengthOfLongestSubstring(String s) {
        // s = "abcabcbb"
        int arr[] = new int[256];
        for(int i=0;i<arr.length;i++){
            arr[i] = -1;
        }
        int left = 0 , right = 0 , maxlength = 0;
        while(right < s.length()){
            if(arr[s.charAt(right)] != -1){ // arr['a'] = 0
                if(arr[s.charAt(right)]>= left){ // 0 >= 0
                // When a repeated character comes inside the current window, move left to : 
                    left = arr[s.charAt(right)]+1; // left = 1 
                }
            }
            int length = right - left + 1;
            maxlength = Math.max(maxlength,length);
            
            // here we store index arr['a'] = 0 then r++ , arr['b'] = 1 , arr['c'] = 2, arr['a'] = 3
            arr[s.charAt(right)] = right;
            right ++;
        }
        return maxlength;
    }
}