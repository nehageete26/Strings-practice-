// class Solution {
//     public boolean isIsomorphic(String s, String t) {
//         if(s.length() != t.length()) return false;
//         HashMap<Character,Character> map = new HashMap<>();
//         HashMap<Character , Boolean> map2 = new HashMap<>();
//         int i=0 , j = 0;
//         while(i < s.length()){
//             char ch1 = s.charAt(i);
//             char ch2 = t.charAt(i);
//             if(map.containsKey(ch1) == true){
//                 if(map.get(ch1) != ch2) return false;
//             }else{
//             if(map2.containsKey(ch2) == true) return false;
//             else{
//                 map.put(ch1 , ch2);
//                 map2.put(ch2 , true);
//             }
//             }
//             i++;
//         }
//         return true;
//     }
// }
import java.util.HashMap;
import java.util.Map;
class Solution {
    public boolean isIsomorphic(String s, String t) {
       if (s.length() !=t.length()){
        return false;
       } 
      int[] mapS = new int[256];
      int[] mapT = new int[256];

      for( int i =0; i<s.length(); i++){
        char c1 = s.charAt(i);
        char c2 = t.charAt(i);

        if (mapS[c1] != mapT[c2]){
            return false;
        }
        mapS[c1] = i +1;
        mapT[c2] =i + 1;
      }
      return true;

    }
}