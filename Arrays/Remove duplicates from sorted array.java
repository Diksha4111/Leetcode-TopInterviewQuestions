class Solution {
    public int removeDuplicates(int[] nums) {
        int len = nums.length;
        if(len == 0){
            return 0;
        }
        if(len == 1){
            return 1;
        }
        int first=0,second = 1;
        for(second=1 ; second<len ; second++){
            if(nums[first]!=nums[second]){
                first++;
                nums[first] = nums[second];
            }
        }
        int ans = first+1;
        return ans;
    }
}
