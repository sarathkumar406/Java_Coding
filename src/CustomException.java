class CustomException extends Exception 
{
	private String str;
	public CustomException(String msg) {
		str = msg;
	}
	public String toString(){
		return ("Custom Exception Called : "+str);
		
	}
	public static void main(String[] args) 
	{
		try
		{
			throw new CustomException(" Custom Exception ");
		}
		catch (CustomException e)
		{
			System.out.println("Exception occurs and catch block is executed");
		}
	}
}
