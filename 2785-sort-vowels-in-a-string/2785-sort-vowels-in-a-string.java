class Solution {
        boolean isvowel(char c){
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
            c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')
            return true;
            else return false;
        }
    public String sortVowels(String s) {
        ArrayList<Character> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(isvowel(s.charAt(i))){
            list.add(s.charAt(i));
            }
        }
        list.sort(null);
        int idx = 0;
        for(char ch : s.toCharArray()){
            if(isvowel(ch)){
            sb.append(list.get(idx));
            idx++;
            }
            else sb.append(ch);
        }
        return sb.toString();
    }
}