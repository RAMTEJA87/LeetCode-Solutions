class Solution {
    public boolean containsDuplicate(int[] nums) 
    {
        LinkedHashMap<Integer , Integer > hm = new LinkedHashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            hm.put(nums[i] , hm.getOrDefault(nums[i],0)+1);
            if(hm.get(nums[i])==2)
            {
                return true;
            }
        }
        return false;
    }
}