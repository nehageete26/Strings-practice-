class Solution {
    int mul(int n){
        if(n == 0) return 0;
        int product = 1;
        while(n != 0){
            int last = n%10;
            product *= last;
            n /= 10;
        }
        return product;
    }
    public int smallestNumber(int n, int t) {
        while(true){
            int product = mul(n);
            if(product % t == 0) return n;
            n++;
        }
    }
}