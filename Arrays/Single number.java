//uses bit manipulation

class Solution {
    public int singleNumber(int[] nums) {
        int result = 0 ; // n XOR 0 = n
        for(int i:nums){
            result = i ^ result;
        }
        return result;
    }
}
