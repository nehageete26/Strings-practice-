class Solution {
    String reversed = "";
    String reverse(String s){
      for(int i=s.length()-1;i>=0;i--){
        reversed += s.charAt(i);
      }
      reversed += " ";
      return reversed;
    }
    public String reverseWords(String s) {
        String str[] = s.split("\\s+");
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<str.length;i++){
            reverse(str[i]);
        }
        return reversed.trim();
    }
}