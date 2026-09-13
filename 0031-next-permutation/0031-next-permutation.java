class Solution {
    public void swap(int arr[],int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public void reverse(int arr[],int a, int b){
        while(a < b) swap(arr,a++,b--);
    }
    int index1 = -1 ,index2 = -1;
    public void nextPermutation(int[] nums) {
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i] < nums[i+1]) {
            index1 = i;
            break;
            }
        }
        if(index1 == -1){
            reverse(nums, 0 , nums.length-1);
            return;
        }
        for(int j = nums.length-1;j > index1; j--){
            if(nums[j] > nums[index1]){
                index2 = j;
                break;
            }
        }
        swap(nums , index1, index2);
        reverse(nums,index1+1,nums.length-1);
    }
}