class Exception_Check {

	public static void main(String[] args) {

		int n = m1();
		System.out.println(n);

	}

	public static int m1() {
		int a = 0;
		try {
			a = 10;
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			a = 13;
			return a;
		}
		//return a;
	}

}