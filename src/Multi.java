import java.util.*;
class Multi implements Runnable 
{
	
	public void run(){
		System.out.println("multi-run");
	}
	public static void main(String[] args) 
	{
		Multi m = new Multi();
		Thread t1 = new Thread(m);
		t1.start();
		//t1.start();// if we start multiple type then java.lang.illegalThreadStateException
		//t1.run();
		System.out.println(t1.getName());
		Map<Integer,Integer> hm = new HashMap<>();
		hm.put(1,1);
		hm.put(2,4);
		hm.put(3,5);
		Thread t3 = new Thread(m){
			public void run(){
				hm.put(4,6);
				hm.remove(4);
			}
		};
		t3.start();
		Thread t2 = new Thread(m){
			public void run(){
				hm.remove(1);
			}
		};
		t2.start();
		System.out.println(t2.getName());
		System.out.println("hm "+hm);
			
		Map<Integer,Integer> myMap = new HashMap<>();

		for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(() -> {

                // Let Each thread insert 3000 Items
                for (int j = 0; j < 300; j++) {
                    
                    myMap.put(1, 100);
                    myMap.remove(1);
                }

            });
	thread.start();
	System.out.println(thread.getName());
		}
			System.out.println("myMap ----------->>> "+myMap);

	}
}
