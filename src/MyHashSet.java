class MyHashSet 
{
	private final int MAX_VALUE = 1000000;
	private final int ARRAY_SIZE = 100;
	private List<List<Integer>> parentList;
	public MyHashSet()
	{
		parentList = new ArrayList<>(ARRAY_SIZE);
		for(int i =0;i<ARRAY_SIZE;i++){
			parentList.add(null);
		}
	}

	public void add(int key){
		int index = key % Array_SIZE;
		List<Integer> childList = new parentList.get(index);
		if(childList==null)
		{
			List<Integer> list = new LinkedList<>();
			list.add(key);
			parentList.add(index,list);
		}
		else if(!childList.contains(key))
		{
			childList.add(key);
		}
	}

	public void remove(int key){
		int index = key % ARRAY_SIZE;
		List<Integer> childList = parentList.get(index);
		if(childList!=null){
			childList.remove(Integer.valueOf(key));
		}
	}

	public boolean contains(int key){
		int index = key % ARRAY_SIZE;
		List<Integer> childList = parentList.get(index);
		return childList!=null && childList.contains(key);
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
