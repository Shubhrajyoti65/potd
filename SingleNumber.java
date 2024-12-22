class Solution {
    public int singleNumber(int[] nums) {
        int size = nums.length;
        if (size == 1){
            return nums[0];
        }
        for(int i=0;i<size;i++){
            boolean flag=true;
            for(int j=0; j<size;j++){
                if(i!=j && nums[i]==nums[j]){
                    flag=false;
                    break;
                }
            }
            if(flag){
            return nums[i];
        }
        } 
 return -1; 
 }
}
// time complexity= O(n^2)