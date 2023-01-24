class Solution {
    public void reverse(int low, int high, int[] arr){
        while(low<high){
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
    }
    public void rotate(int[] nums, int k) {
        int len = nums.length;
        /* Ist approach --> using another array of same length and adding elements in the new array at an index = index+k 
        
        int[] arr = new int[len];
        for(int i=0 ; i<len ; i++){
            if(i < (len-k)){
                arr[i+k] = nums[i];
            }
            else{
                int idx = (i+k)%len;
                arr[idx] = nums[i];
            }
        }
        for(int i=0 ; i<len ; i++){
            nums[i] = arr[i];
        }*/
        
        // IInd approach --> reversing
        k = k%len;
        reverse(0,len-1,nums); //reverse the entire array
        
        reverse(0,k-1,nums); //reverse the first k elements
        
        reverse(k,len-1,nums); //reverse the remaining elements
        
    }
}
