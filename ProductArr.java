class Solution {
    public int[] productExceptSelf(int[] nums) {
      int [] product= new int[nums.length];
       for(int i=0;i<nums.length;i++){
        product[i]=1;
       }
      int pre=1;
      for(int i=0;i<nums.length;i++){
              product[i] *= pre;
              pre *=nums[i];
      }
      int post=1;
      for(int i=nums.length-1;i>=0;i--){
            product[i] *= post;
            post *= nums[i];
      }
      return product;
    }
}
// time complexity = 2ms