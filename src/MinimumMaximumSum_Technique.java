import java.util.*;
class MinimumMaximumSum_Technique 
{
	public static void main(String[] args) 
	{
		int[] arr = {2, 5, -1, 7, -3, -1, -2};
		int k =3;
		int n = arr.length;
		int sum =0;
		Deque<Integer> S = new LinkedList<>();// greater
		Deque<Integer> G = new LinkedList<>();// smaller

		for(int i =0;i<k;i++)
		{
			while(!S.isEmpty() && arr[S.peekLast()] >= arr[i])
			{
				S.removeLast();
			}
			while(!G.isEmpty() && arr[G.peekLast()] <= arr[i])
			{
				G.removeLast();
			}
			S.addLast(i);
			G.addLast(i);
		}

		for(int i =k;i<n;i++)
		{
			sum+=arr[S.peekFirst()]+arr[G.peekFirst()];

			while(!S.isEmpty() && S.peekFirst() <= i-k){
				S.removeFirst();
			}

			while(!G.isEmpty() && G.peekFirst() <= i-k){
				G.removeFirst();
			}
			
			while(!S.isEmpty() && arr[S.peekLast()] >= arr[i])
			{
				S.removeLast();
			}
			while(!G.isEmpty() && arr[G.peekLast()] <= arr[i])
			{
				G.removeLast();
			}

			S.addLast(i);
			G.addLast(i);
			
		}

		sum+=arr[S.peekFirst()] + arr[G.peekFirst()];

		System.out.println(sum);

	}
}
/*
taking two deques, one is for greater values, one is for Smaller values.
and then we go through the window upto k values check the one deque less than current array value then remove that
last element , check the value greater than current element then remove that element
and after last add the current element to two deques

then process from k to n 
cal sum

*/