class Solution {
    private String getactualstring(String input){
        int hash = 0;
        StringBuilder actualstring = new StringBuilder();
        for(int i=input.length()-1;i>=0;i--){
            if(input.charAt(i) == '#'){
                hash++;
                continue;
            }

            if(hash >0){
                hash--;
            }
            else actualstring.append(input.charAt(i));
        }
        return actualstring.toString();
    }
    public boolean backspaceCompare(String s, String t) {
        return getactualstring(s).equals(getactualstring(t));
    }
}

// we can also use stack 
// class Solution {
//     public String backspaceRemove(String str) {
//         Stack<Character> st = new Stack<>();
//         for (char ch : str.toCharArray()) {
//             if (ch != '#') {
//                 st.push(ch);
//             } else {
//                 if (!st.isEmpty()) {
//                     st.pop();
//                 }
//             }
//         }
//         StringBuilder res = new StringBuilder();
//         for (char ch : st) {
//             res.append(ch);
//         }

//         return res.toString();
//     }
//     public boolean backspaceCompare(String s, String t) {
//         return backspaceRemove(s).equals(backspaceRemove(t));
//     }
// }