/*
    Time Complexity: O(N^2)
    Space Complexity: O(1)

    where N is the number of elements i.e the size of the input array.
*/

import java.util.*;

public class PairSum {

    // Return type array[count][2], where count denotes number of pairs with sum equals to S.
    public static int[][] pairSum(int arr[], int S) {
        int n = arr.length;
	
	List<int[]> ans = new ArrayList();
	for(int i = 0; i < n; i++) {
		for(int j = i + 1; j < n; j++) {
			if(arr[i] + arr[j] == S) {
				int[] pair = new int[2];
				pair[0] = arr[i];
				pair[1] = arr[j];
				ans.add(pair);
			}
		}
	}

	int res[][] = new int[ans.size()][2];
	for(int i = 0; i < ans.size(); i++) {
	    int a = ans.get(i)[0], b = ans.get(i)[1];
	    res[i][0] = Math.min(a, b);
	    res[i][1] = Math.max(a, b);
	}
	
	Arrays.sort(res, new Comparator<int[]>() {
	    public int compare(int[] a, int[] b) {
		if(a[0] == b[0]) {
		    return a[1] - b[1];
		}
		return a[0] - b[0];
	    }
	});
	
	return res;
    }
}