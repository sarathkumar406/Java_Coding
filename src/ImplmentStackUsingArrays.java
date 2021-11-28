class ImplmentStackUsingArrays 
{
	private static int CAPACITY =10;
	
	private int capacity;
	
	private int[] stackRep;
	
	private int top = -1;

	public ImplmentStackUsingArrays()
	{
		this(CAPACITY);
	}
	public ImplmentStackUsingArrays(int cap)
	{
		capacity = cap;
		stackRep = new int[capacity];
	}

	public int getSize(){
		return top+1;
	}

	public boolean isEmpty()
	{
		return (top < 0);
	}

	public void push(int data)
	{
		if(getSize() == capacity)
		{
			System.out.println("Stack is full..");
			return;
		}
		stackRep[++top] = data;
	}

	public int pop()
	{
		if(isEmpty())
		{
			System.out.println("Stack is Empty...");
			return;
		}
		int data = stackRep[top];
		stackRep[top--] = Integer.MIN_VALUE;
		return data;
	}

	public int top(){
		if(isEmpty())
		{
			System.out.println("Stack is Empty...");
		}
	}
	public static void main(String[] args) 
	{
		
	}

}
