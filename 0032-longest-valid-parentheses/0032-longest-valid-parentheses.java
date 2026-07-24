class Solution {
    public int longestValidParentheses(String s) {
        if(s == null || s.length() == 0) return 0;
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(!st.isEmpty() && s.charAt(i) == ')' && s.charAt(st.peek()) == '(') st.pop();
            else st.push(i);
        }
        int idx = s.length();
        int max = 0;
        while (!st.isEmpty()) {
        int curr = st.pop();
        max = Math.max(max, idx - curr - 1);
        idx = curr;
    }
        max = Math.max(max, idx);
        return max;
    }
}