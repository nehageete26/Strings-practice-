class Solution {
    public int firstMissingPositive(int[] nums) {
        int missing = 1; // becoz we want +ve missing 
        Arrays.sort(nums);
        for(int i= 0; i< nums.length; i++){
        if(nums[i] > 0){
            if(nums[i] == missing) missing++;
            else if(nums[i] > missing) break;
        } 
        }
        return missing;
    }
}