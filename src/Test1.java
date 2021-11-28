class Test1
{
	void test(){
		System.out.println("parent class");
	}
	
}
class child extends Test1
{
	void test(){
		System.out.println("child class");
	}
	public static void main(String args[]){
		child p = new child();
		p.test();
	}
}
