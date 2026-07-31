// class Solution {
//     public String restoreString(String s, int[] indices) {
//         HashMap<Integer,Character> map = new HashMap<>();
//         StringBuilder sb = new StringBuilder();
//         int i = 0, j = 0;
//         while(i < s.length() && j < indices.length){
//             map.put(indices[j],s.charAt(i));
//             i++;
//             j++;
//         }
//         for(int k=0;k<map.size();k++){
//            sb.append(map.get(k));
//         }
//         return sb.toString();
//     }
// }

class Solution {
    public String restoreString(String s, int[] indices) {
        char[] c = new char[indices.length];
        for(int i = 0; i < indices.length; i++)
            c[indices[i]] = s.charAt(i);
        return new String(c);
    }
}