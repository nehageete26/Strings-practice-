// class Solution {
//     public boolean ispalindrome(String s , int i, int j){
//         while(i<j){
//             if(s.charAt(i)!=s.charAt(j)) return false;
//             i++;
//             j--; 
//         }
//         return true;
//     }
//     public String longestPalindrome(String s) {
//         int maxi = 0, start = 0, end = 0;
//           for(int i=0;i<s.length();i++){
//             for(int j=i;j<s.length();j++){
//                 if(ispalindrome(s,i,j) == true){
//                     if((j-i+1) > maxi){
//                     maxi = j-i+1;
//                     start = i;
//                     end = j;
//                     }
//                 }
//             }
//           }
//           return s.substring(start , end+1);
//     }
// }
// the above code complexity is O(N^3) which is worst , you can solve using two pointers and manacher whatever for opti
class Solution{
    public String longestPalindrome(String s){
        int n = s.length();
        String longest_palindrome_substring = "";
        if(n <= 1) return s;
        int low = 0, high = 0;
        // for odd length -
        for(int i=0;i<n;i++){
            low = i;
            high = i;
            while(low >=0 && high < n && s.charAt(low)==s.charAt(high)){
                low --;
                high++;
            }
                String palindrome_string = s.substring(low+1,high);
                if(palindrome_string.length()>longest_palindrome_substring.length()) longest_palindrome_substring = palindrome_string;
            
            // even length -
            low = i-1;
            high = i;
                 while(low >=0 && high < n && s.charAt(low)==s.charAt(high)){
                low --;
                high++;
                }
                palindrome_string = s.substring(low+1,high);
                if(palindrome_string.length()>longest_palindrome_substring.length()) longest_palindrome_substring = palindrome_string;
            }
        return longest_palindrome_substring;
    }
}