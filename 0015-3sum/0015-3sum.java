class Solution{
public List<List<Integer>> threeSum(int[] A) {
	List<List<Integer>>res = new ArrayList<List<Integer>>();
	if (A == null || A.length == 0)
		return res;
	Arrays.sort(A);
	for (int i = 0; i < A.length; i++) {
		if (i - 1 >= 0 && A[i] == A[i - 1]) continue; 
		  
		int left = i + 1, right = A.length - 1; 
		while (left < right) {// Two Pointers
			int sum = A[i] + A[left] + A[right];
			if (sum == 0) { 
				res.add(Arrays.asList(A[i], A[left], A[right]));
				while (left + 1 < right && A[left] == A[left+1])
					left++;
				while (right -1 > left && A[right] == A[right-1])
					right--;
                 left++; 
				right--;
			} else if (sum < 0) { 
				left++;
			} else {
				right--;
			}
		}
	}
	return res;
}}