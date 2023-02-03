class Solution {
    public int removeElement(int[] nums, int val) {
        int low = 0;
        for (int high = 0; high < nums.length; high++) {
            if (nums[high] != val) {
                int temp = nums[low];
                nums[low] = nums[high];
                nums[high] = temp;
                low++;
            }
        }
        return low;
    }
}
