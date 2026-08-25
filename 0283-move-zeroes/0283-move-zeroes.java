class Solution {
    public void moveZeroes(int[] nums) 
    {
        int n = nums.length-1;
        int i=0;
        int j=0;
        while(i<n && j <n)
        {
            while(nums[i]!=0 && i<n)
            {
                i++;
                j++;
            }
            while(nums[j]==0 && j<n)
            {
                j++;
            }
            
            int t = nums[i];
            nums[i] = nums[j];
            nums[j] = t;
        }
    }
} 