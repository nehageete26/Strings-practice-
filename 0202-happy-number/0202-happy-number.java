class Solution {
    public boolean isHappy(int n) {
        while(true){
            int sum = 0;
        while(n != 0){
            int lastdigit = n%10;
            sum += lastdigit*lastdigit;
            n /= 10;
        }
            if(sum == 1) return true;
            if(sum == 4) return false;
            n = sum;
        }
    }
}