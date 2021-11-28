import java.util.*;
class TempValue {
    int value = 3;

   /* @Override
    public int hashCode() {
        return 1; // All objects of this class will have same hashcode.
    }
	*/
}

public class TestClass {
    public static void main(String args[]) {
        Map<TempValue, TempValue> myMap = new HashMap<>();
        List<Thread> listOfThreads = new ArrayList<>();

        // Create 10 Threads
        for (int i = 0; i < 10; i++) {
			System.out.println("inside for loop");
            Thread thread = new Thread(() -> {
				
                // Let Each thread insert 3000 Items
                for (int j = 0; j < 3000; j++) {
                    TempValue key = new TempValue();
                    myMap.put(key, key);
                }

            });
            thread.start();
            listOfThreads.add(thread);
        }

      /*  for (Thread thread : listOfThreads) {
            thread.join();
        }*/
        System.out.println("Count should be 30000, actual is : " + myMap.size());
        System.out.println("listOfThreads : " + listOfThreads);
    }
}