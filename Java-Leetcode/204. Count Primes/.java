class Solution {
    public int countPrimes(int n) {
        if (n <= 2) return 0;                                         //if N <= 2 let say prime = 0 

        int m = n / 2;                                               // skip even number    
        boolean[] comp = new boolean[m];                             // Create array to contain boolean n/2 size

        int limit = ((int)Math.sqrt(n) - 1) / 2;
        for (int i = 1; i <= limit; i++) {      
            if (!comp[i]) {
                int p = 2*i + 1;
                int start = (p*p - 1) / 2;     
                for (int j = start; j < m; j += p) comp[j] = true;
            }
        }

        int count = 1;                                                // start counting at 1 (2)
        for (int i = 1; i < m; i++)
         if (!comp[i]) count++;
        return count;
    }
}
