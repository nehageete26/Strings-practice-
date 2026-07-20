class Solution {
    public int numSub(String s) {
        int j = s.length()-1;
        long count=0,totalcount = 0;
        while(j >=0){
            if(s.charAt(j) != '0'){
                count ++;
            }
            else{
                totalcount += count*(count+1)/2;
                count = 0;
            }
            j--;
        }
        if(count > 0) totalcount += count*(count+1)/2;
        return (int) (totalcount % 1000000007);
    }
}