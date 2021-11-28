import java.util.*;
import java.util.stream.*;
class Streams_check 
{
	public static void main(String[] args) 
	{
		int[] arr = {2,3,4,5};
		List<Integer> number = Arrays.asList(2,3,4,5);
		
		//Map functionality in stream
		List<Integer> squere = number.stream().map(x->x*x).collect(Collectors.toList());

		System.out.println(number);
		System.out.println(squere);
	
		List<String> names = Arrays.asList("Reflcetion","Conclusion","Sarat","Sai");

		List<String> res_names = names.stream().filter(s->s.startsWith("S")).collect(Collectors.toList());

		System.out.println("names --------->>> "+names);
		System.out.println("res_names --------->>> "+res_names);

		int even = 
       number.stream().filter(x->x%2==0).reduce(0,(ans,i)-> ans+i); 

		System.out.println("even vale "+even);


		Integer maxNumber = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9)
									.max(Comparator.comparing(Integer::valueOf)).get();

		System.out.println("maxNumber --->> "+maxNumber);


		HashMap<Integer,Integer> hm = new HashMap<>();
		Map<Integer,Integer> lhm = new LinkedHashMap<>();

		hm.put(1,23);
		hm.put(2,24);
		hm.put(3,22);
		hm.put(4,21);

		lhm.put(1,23);
		lhm.put(2,24);
		lhm.put(3,22);
		lhm.put(4,21);
		System.out.println("----------------hashmap----------------");
		System.out.println(hm);

		

		for(Map.Entry<Integer,Integer> entry : hm.entrySet()){

			System.out.println(entry.getKey()+" "+entry.getValue());
		}
				System.out.println("----------------Linekdhashmap----------------");
				System.out.println(lhm);
		for(Map.Entry<Integer,Integer> entry : lhm.entrySet()){

			System.out.println(entry.getKey()+" "+entry.getValue());
		}

		hm.forEach((k,v)->System.out.println("keys is : "+k+" value is : "+v));

		System.out.println("-------keyset---------");

		for(Integer itr:hm.keySet()){
			System.out.print(itr+" ");
		}
		
		System.out.println(arr.indexOf(1));

	}

/*
	private int used;
		private int size;
		int[] keys;

/** Initialize your data structure here. */
/*public MyHashSet() {
    this.keys = new int[2];
    for(int i = 0; i < this.keys.length; i++){
        this.keys[i] = -1;
    }
     this.size = 2;
     this.used = 0;

}

public void add(int key) {
    int size;
    if(this.used < this.size){
        if(this.contains(key)){
            return;
        }
        else{
            this.keys[used] = key;
            used++;
        }
    }
    else{
        this.size = this.size*2;
        int[] keyUpdated = new int[this.size];
        for(int i = 0; i < keyUpdated.length; i++){
            keyUpdated[i] = -1;
        }
        for(int i =0; i < this.keys.length; i++){
            keyUpdated[i] = keys[i];
        }
        this.keys = keyUpdated;
        if(this.contains(key)){
            return;
        }
        else{
            this.keys[used] = key;
            used++;
        }

    }



}

public void remove(int key) {

    if(this.used == 0 || this.contains(key) == false){
        return;
    }
    int[] newArray = new int[this.size-1];
    for(int i =0; i< this.keys.length; i++){
        if(this.keys[i] != key){
            newArray[i] = keys[i];
        }

    }
    this.keys = newArray;

}

/** Returns true if this set contains the specified element */
/*public boolean contains(int key) {

    for(int i =0; i < this.keys.length; i++){
        if(this.keys[i] == key){
            return true;
        }
    }
    return false;
}
	}
}
*/


 /*private int numbuckets = 1500;
        List<Integer>[] buckets;
    
    private int hash_funtion(int key){
        return key % numbuckets;
    }
	public MyHashSet()
	{
		buckets = new LinkedList[numbuckets];
	}

	public void add(int key){
		int i = hash_funtion(key);
        if(buckets[i]==null)
            buckets[i] = new LinkedList<>();
        if(buckets[i].indexOf(key)==-1)
            buckets[i].add(key);
	}
    
    public void remove(int key){
        int i = hash_funtion(key);
        if(buckets[i]==null)
            return;
        if(buckets[i].indexOf(key)!=-1)
            buckets[i].remove(buckets[i].indexOf(key));
    }

	
    /** Returns true if this set contains the specified element */
  /*  public boolean contains(int key) {
      int i = hash_funtion(key);
        if(buckets[i]==null || buckets[i].indexOf(key)==-1)
            return false;
        else
            return true;
        
    }*/
}
