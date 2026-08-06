class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        if (nums == null || nums.length == 0) return false;
        int mid = nums[nums.length/2];
        int count = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == mid) count++;
        }
        return count ==1 ;
    }
}