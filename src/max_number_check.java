class  max_number_check
{
	public static void main(String[] args) 
	{
		int res = max_number(5438);
		System.out.println(res);
	}

	   public static int max_number(int n){
        int maxnum=0;
	    int i=1;
	    while(n/i>0)
	    {
	        int newnum=(n/(i*10))*i+n%i; // 543*1+8 = 551
			System.out.println(" new "+newnum);
			System.out.println(" new maxnum"+maxnum);
	        i=i*10;
			//System.out.println(" neweee "+(n/i));
	        if(maxnum<newnum)
	            maxnum = newnum;
	    }
	    
	    return maxnum;

    }
}
