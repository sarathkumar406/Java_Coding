class QuickSort 
{
	public static void main(String[] args) 
	{
		
	}
	QuickSort(int[] A, int low, int high){
		if(low < high)
		{
			loc = partition(A,low,high);
			QuickSort(A,low,loc-1);
			QuickSort(A,loc+1,high);
		}
	}
	partition(int[] A, int low, int high){
		int pivot = A[low];
		int start = low;
		int end = high;
		while(start < end)
		{
			while(A[start] < A[pivot])
			{
				strat++;
			}
			while(A[end] > A[pivot])
			{
				end--;
			}
			if(start<end)
			{
				swap(A[start],A[end]);
			}
		}
		swap(A[low],A[end])
		return end;
	}
}


int pivot = A[high];
int i = (low-1);

if(low < high)
{
	for(int j = low;j<high;j++)
	{
		if (A[j] <= pivot) {
		i++;
		int temp = A[j];
		A[j] = A[i];
		A[i] = temp;
		}
	}

	int temp = A[i+1];
	A[i+1] = A[high];
	A[high] = temp;
	return (i+1);
}



if(low < high )
{
	int pi = QuickSort( A, low, high);
	
	QuickSort( A, low, pi-1);
	QuickSort( A, pi+1, high);

}