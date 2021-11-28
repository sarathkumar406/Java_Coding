class HamingWeight 
{
	public static void main(String[] args) 
	{
		int number = 00000000000000000000000000001011;
		int res = hamingWeight(number);
		System.out.println(res);
	}

	public static int hamingWeight(int n){

		int count = 0;
		 for (int i = 0; i < 32; ++i) {
        if (((n >>> i) & 1) == 1) {
            ++count;
        }
    }
		//return Integer.bitCount(n);
		return count;
	}
	//haming distance formula is 
	// first we need to find the XOR operation and then we need to find the counts of 1's
	 public int totalHammingDistance(int[] nums) {
        int totalHamingCount = 0;
        int bit = 0;
        while(bit < 32){
            int numOnes = 0;
            for(int i = 0;i<nums.length;i++){
                numOnes += nums[i] & 1;
                nums[i] = nums[i] >> 1;
            }
            bit++;
            totalHamingCount += numOnes * (nums.length-numOnes);
            
        }
}
