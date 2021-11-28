class Check123 
{
	static int a = 10;
	int b = 20;
	void m1(){
		//static int c = 30;
		System.out.println("non static a "+a);
		System.out.println("non static b "+b);

	}
	static void m2(){
		int c = 20;
		System.out.println("static a "+a);
		System.out.println("static c "+c);
		//System.out.println("static b "+b);
		Check123 c1 = new Check123();
		c1.m1();
	}
	static {
		int aa = 100;
		System.out.println("static block a "+a);
		//System.out.println("static block b "+b);
		Check123 c1 = new Check123();
		c1.m1();
	}
	public static void main(String[] args) 
	{
		//Check123 c = new Check123();
		//c.m1();
		//m2();
	}
}
