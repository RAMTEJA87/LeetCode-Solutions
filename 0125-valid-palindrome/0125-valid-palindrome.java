class Solution {
    public boolean isPalindrome(String s) 
    {
        int i = 0 ; 
        int j = s.length()-1;
        s = s.toLowerCase();
        StringBuffer sb = new StringBuffer();
        for(int k =0 ;k<=j;k++)
        {
            if((s.charAt(k)>=97 && s.charAt(k)<=122) || (s.charAt(k) >=48 && s.charAt(k) <=57 ))
            {
                sb.append(s.charAt(k));
            }
        }
        s=sb.toString();
        j = s.length()-1;
        System.out.println(s);
        while(i<j)
        {
            if(s.charAt(i)!=s.charAt(j))
            {
                return false;
            }
            i++;
            j--;
        }
        return true;

    }
}