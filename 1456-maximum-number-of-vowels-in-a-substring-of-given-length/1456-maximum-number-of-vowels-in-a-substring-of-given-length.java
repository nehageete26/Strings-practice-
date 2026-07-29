class Solution {
    public boolean isVowel(char ch) {
            if(ch == 'a'|| ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || 
               ch == 'A'|| ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') return true;
               else return false;
        }
    public int maxVowels(String s, int k) {
        // below works well but gives tle becoz of the constraints
        // int count = 0;
        // int j = 0, i = 0, maxi = 0;
        // while(i <= s.length()-k){
        //     count = 0;
        //     j = i;
        // while(j-i+1 <= k){
        //     if(isVowel(s.charAt(j))){
        //         count ++;
        //     }
        //     j++;
        // }
        // maxi = Math.max(maxi , count);
        // i++;
        // }
        int count =0, maxi = 0;
        for(int i=0;i<k;i++){
            if(isVowel(s.charAt(i))) count ++;
        }
        maxi = count;
        for(int i=k;i<s.length();i++){
            if(isVowel(s.charAt(i))) count++;
            if(isVowel(s.charAt(i-k))) count--; // when window, move decrease the count of the vowel if present in the original window
            maxi = Math.max(maxi,count);
        }
        return maxi;
    }
}