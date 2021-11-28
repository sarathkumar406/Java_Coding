class LongestPalindrome 
{
	
	public static void main(String[] args) 
	{
		System.out.println(longestPalindrome("cbbd"));
	}
	
	 public static String longestPalindrome(String s) {
       int len = s.length();
    if (len < 2) {
      return s;
    }
        int st =0,en =0;
    for (int i = 0; i < len; i++) {
      int len1 = makePalindrome(s, i, i);
     int len2 = makePalindrome(s, i, i + 1);
        int length = Math.max(len1,len2);
        if(length > en-st)
        {
            st = i- (length-1)/2;
            en = i+length/2;
        } 
    }
    return s.substring(st, en+1);
  }
  private static int makePalindrome(String s, int j, int k) {
    while (j >= 0 && k < s.length() && (s.charAt(j) == s.charAt(k))) {
      j--;
      k++;
    }
    return k - j - 1;
    
  }
}
