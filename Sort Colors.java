class Solution {
  public void sortColors(int[] nums) {
      int red = 0;
      int white = 0;
      int blue = 0;
      for(int num : nums){
          if(num == 0) red ++;
          else if(num == 1) white ++;
          else if(num == 2) blue ++;
      }    

      for(int i = 0; i < nums.length; i++){
          if(red != 0) {
              nums[i] =0;
              red --;
          }
          else if(white != 0) {
              nums[i] =1;
              white --;
          }
          else{
              nums[i] = 2;
              blue --;
          }
      }
  }
}
