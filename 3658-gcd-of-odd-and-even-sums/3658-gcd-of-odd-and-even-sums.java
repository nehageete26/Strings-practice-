class Solution {
    public int gcdOfOddEvenSums(int n) {
        int sumeven=0;
        int sumodd=0;
        for(int i=1;i<=n*2;i++){
            if(i%2==0) sumeven+=i;
            else sumodd+=i;
        }
         return gcd(sumeven ,sumodd);
    }
    // GCD(a,b)=GCD(b,a%b)   
    //while(b != 0)
    //remainder = a % b
    //a = b
    //b = remainder  then return a
        public static int gcd(int sumeven,int sumodd){
            while(sumodd != 0){
                int temp=sumodd;
                sumodd=sumeven%sumodd;
                sumeven=temp;
            }

            return sumeven;
        }

        

    
}