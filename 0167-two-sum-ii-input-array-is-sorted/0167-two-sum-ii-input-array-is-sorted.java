class Solution {
    public int[] twoSum(int[] numbers, int target) 
    {
        int l =0 ;
        int h =numbers.length-1;
        while(l<h)
        {
            int s = numbers[l] +numbers[h];
            if(s == target)
            {
                break;
            }
            else if(s < target)
            {
                l++;
            }
            else
            {
                h--;
            }
        }   

        return new int[]{l+1,h+1};
    }
}