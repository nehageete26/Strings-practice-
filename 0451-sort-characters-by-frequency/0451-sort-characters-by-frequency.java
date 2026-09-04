class Solution {
    public String frequencySort(String s) {
        HashMap<Character , Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i), 0)+1);
        }
        StringBuilder sb = new StringBuilder();
        while(!map.isEmpty()){
            int maxi = 0;
            char maxchar = ' ';
            for(char ch: map.keySet()){
                if(map.get(ch) > maxi){
                    maxchar = ch;
                    maxi = map.get(ch);
                }
            }
            for(int i=0;i<maxi;i++){
               sb.append(maxchar);
            }
            map.remove(maxchar);
        }
        return sb.toString();
    }
}