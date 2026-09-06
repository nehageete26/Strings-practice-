class Solution {
    StringBuilder sb = new StringBuilder();
    String capital(String s){
        if (s.length() <= 2) sb.append(s.toLowerCase());
        else {sb.append(Character.toUpperCase(s.charAt(0)));
        for(int i=1;i<s.length();i++){
        sb.append(Character.toLowerCase(s.charAt(i)));
        }
        }
        sb.append(" ");
        return sb.toString().trim();
    }
    public String capitalizeTitle(String title) {
        String arr[] = title.split("\\s");
        for(int i=0;i<arr.length;i++){
            capital(arr[i]);
        }
        return sb.toString().trim();
    }
}