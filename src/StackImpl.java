import java.util.*;
class StackImpl 
{
	public static final int capacity =10;
	private int capa;
	private int[] stackTest;
	private int top = -1;
	public StackImpl(){
		this(capacity);
	}
	public StackImpl(int cap){
		capa = cap;
		System.out.println(capa);
		stackTest = new int[capa];
	}

	//insert push
	public void push(int data){
		if(isFull()){
			System.out.println("Stack is full");
			return;
		}
		stackTest[++top] = data;
	}

	//top return top value
	public int top(){
		if(isEmpty())
		{
			System.out.println("Stack is empty");
			return 0;
		}
		return stackTest[top];
	}
	//remove and return using pop()
	public int pop(){
		int data;
		if(isEmpty())
		{
			System.out.println("Stack is empty");
			return 0;
		}
		data = stackTest[top];
		stackTest[top--] = Integer.MIN_VALUE;
		return data;
	}
	public int size()
	{
		return (top+1);
	}
	public boolean isEmpty(){
		return (top < 0);
	}
	public boolean isFull(){
		return (size()==capacity);
	}

	public static void main(String[] args) 
	{
		StackImpl s = new StackImpl();
		s.push(1);
		s.push(2);
		System.out.println(s.top());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.top());
	}
}
