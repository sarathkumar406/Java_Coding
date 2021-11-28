class LogFile
{
	private static boolean logDb = false;
	public static void main(String[] args) 
	{
		if(logDb)
		{
			logToTempFile("insert data into file");
		}

	}

	public static synchronized void logToTempFile(String type)
	{
		PrintWriter pw;
		try
		{
			pw = new PrintWriter(new FileWriter("filePath",true));
		}
		catch (Exception e)
		{
			System.out.println(e);
			return;
		}
		pw.println(type);
		pw.flush();
		pw.close();
	}

}
