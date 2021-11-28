/*
A B C D E
A B C D 
A B C
A B
A
A
A B
A B C
A B C D
A B C D E

E E E E E
D D D D
C C C
B B
A


A
B C
D E F
G H I J


*/
class Pattern_check 
{
	public static void main(String[] args) 
	{
		for(int i = 5; i>=1;i--){
			for(int j =1;j<=i;j++){
				int a = 64+j;
				System.out.print((char)a+" ");
			}
			System.out.println();
		}
		
		for(int i = 2;i<=5;i++){
			for(int j =1;j<=i;j++){
				int a = 64+j;
				System.out.print((char)a+" ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("=================****************===========");
		System.out.println();
		for(int i = 5; i>=1;i--){
			for(int j =1;j<=i;j++){
				int a = 64+i;
				System.out.print((char)a+" ");
			}
			System.out.println();
		}

		System.out.println();
		System.out.println("=================****************===========");
		System.out.println();

		int count = 1;
		for(int i =1;i<=5;i++)
		{
			for(int j =1;j<=i;j++)
			{
				int a = 64+count;
				System.out.print(((char)(64+count))+" ");
				count++;
			}
			System.out.println();
		}
		
	}
}

// Insertion sort
/*
for(int i = 1;i<n;i++)
{
	temp = A[i];
	j = i-1;
	while(j>=0 && A[j] > temp)
	{
		A[j+1] = A[j];
		j--;
	}
	A[j+1] = temp;
}

*/