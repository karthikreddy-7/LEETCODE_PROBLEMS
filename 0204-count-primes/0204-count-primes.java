class Solution {
    public int countPrimes(int n) {
        boolean[] isprime = new boolean[n];
        Arrays.fill(isprime, true);
        if (n==0 || n==1){
            return 0;
        }
        if (n>1){
            isprime[0] = false;
            isprime[1] = false;

        }
        
        for (int i = 2; i * i <= n; i++) {
            for (int j = 2 * i; j < n; j = j + i) {
                isprime[j] = false;
            }
        }
        int count=0;
        for (int i=0;i<isprime.length;i++){
            if (isprime[i]){
                count++;
            }
        }
        return count;
    }
}