class Solution {
    public int removeDuplicates(int[] nums) 
    {
       int l =0 ;
       int h = 1;
       while(h<nums.length)
       {
            if(nums[l]!=nums[h])
            {
                nums[++l]=nums[h++];
            }
            else
            {
                h++;
            }

       }
       return ++l;

    }
}