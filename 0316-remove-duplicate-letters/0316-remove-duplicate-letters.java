class Solution {
    public String removeDuplicateLetters(String s) {
        Stack<Character> st = new Stack<>();
        int freq[] = new int[26]; 
        boolean visited[] = new boolean[26];//false;
        for(char ch:s.toCharArray()){
            freq[ch - 'a']++;
        }
        for(char ch:s.toCharArray()){
            int index = ch-'a';
            freq[index]--;
            if(visited[index]) continue;
            while(!st.isEmpty() && st.peek() > ch && freq[st.peek()-'a'] >0){
                visited[st.pop()-'a'] = false;
            }
            st.push(ch);
            visited[index] = true;
        }
        StringBuilder ans = new StringBuilder();
        for(char ch : st){
            ans.append(ch);
        }
        return ans.toString();
    }
}