class check1234
{
	public static void main(String[] args) 
	{
		
	}

	public void push(int data)
	{
		ListNode temp = new ListNode(data);
		temp.setNext(top);
		top=temp;
		length++;
	}

	public int pop()
	{
		int res = top.getdata();
		top = top.getNext();
		length--;
		return res;
	}
}
