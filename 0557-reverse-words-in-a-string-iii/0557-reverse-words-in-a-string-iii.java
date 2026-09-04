class Solution {
    String reversed = "";
    StringBuilder sb = new StringBuilder();
    String reverse(String s) {
        for (int i = s.length() - 1; i >= 0; i--) {
            //reversed += s.charAt(i);
            sb.append(s.charAt(i));
        }
        // reversed += " ";
        sb.append(" ");
        // return reversed;
        return sb.toString();
    }
    public String reverseWords(String s) {
        String str[] = s.split("\\s+");
        for (int i = 0; i < str.length; i++) {
            reverse(str[i]);
        }
        // return reversed.trim();
        return sb.toString().trim();
    }
}