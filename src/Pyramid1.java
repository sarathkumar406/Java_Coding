class Pyramid1 
{
	public static void main(String[] args) 
	{
		int rows = 5;
/*
		*
	   **
	  ***
	 ****
	*****


		for(int i =0;i<=rows;i++)
		{
			for(int spaces=0;spaces<rows-i;++spaces){
				System.out.print(" ");
			}

			for(int j=0;j<=i;++j){
				System.out.print("*");
			}
			System.out.println();
		}
*/
/*
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5

		for(int i =1;i<=rows;i++){
			for(int j =1;j<=i;j++){
				System.out.print(j+" ");
			}
			System.out.println();
		}

*/

/*

A
B B
C C C
D D D D
E E E E E
		char last ='E',start='A';
		for(int i =1;i<=(last-'A'+1);i++){ // directly we can mention rows also
			for(int j =1;j<=i;j++){
				System.out.print(start+" ");
			}
			start++;
			System.out.println();
		}
*/

/*
* * * * *
* * * *
* * *
* *
*

for(int i =1;i<=rows;i++){
	for(int j =i;j<=rows;j++){
		System.out.print("* ");
	}
	System.out.println();
}
*/

/*
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1

for(int i =1;i<=rows;i++){
	for(int j =1;j<=rows-i+1;j++){
		System.out.print(j+" ");
	}
	System.out.println();
}

one more solution for this below ::--


for(int i=rows;i>=1;i--){
	for(int j =1;j<=i;j++){
		System.out.print(j+" ");
	}
	System.out.println();
}
*/

/*
        *
      * * *
    * * * * *
  * * * * * * *
* * * * * * * * *

	for(int i=1;i<=rows;i++){
		for(int spaces =1;spaces<=rows-i;spaces++){
			System.out.print("  ");
		}
		for(int j =1;j<=i;j++)
		{
			System.out.print("* ");
		}
		for(int k =2;k<=i;k++)
		{
			System.out.print("* ");
		}
		System.out.println();
	}

//Another Approach#
//=================
int k =0;
	for(int i=1;i<=rows;i++,k=0){
		for(int spaces =1;spaces<=rows-i;spaces++){
			System.out.print("  ");
		}
		while(k!=2*i-1){
			System.out.print("* ");
			k++;
		}	
		System.out.println();
	}
*/


for(int i =1;i<=rows;i++){
	for(int spaces =1;spaces<=rows-i;spaces++){
		System.out.print(" ");
	}
	for(int j =1;j<=i;j++){
		System.out.print((i));
	}
	System.out.println();
}











	}
}
