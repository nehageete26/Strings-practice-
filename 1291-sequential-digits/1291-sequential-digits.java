class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        String s = "123456789";
        List<Integer> ans = new ArrayList<>();
        int len_low = String.valueOf(low).length();
        int len_high = String.valueOf(high).length();

        for(int i=len_low;i<=len_high;i++){
            for(int j=0;j+i<=9;j++){
                int num = Integer.parseInt(s.substring(j,j+i));
                if(num>=low && num<=high) ans.add(num);
            }
        }
        return ans;
    }
}