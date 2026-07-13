class Solution {
    public String addStrings(String num1, String num2) {
        // fist of all convert each character to integer first using (nums.charAt(i) - '0');
        int i = num1.length()-1, j=num2.length()-1, carry = 0;
        StringBuilder sb = new StringBuilder();
        while(i>=0 || j>=0 || carry > 0){
            int digit1 = 0, digit2 = 0;
            if(i>=0) digit1 = num1.charAt(i)-'0'; 
            if(j>=0) digit2 = num2.charAt(j)-'0';

            int sum = digit1 + digit2 + carry;
            carry = sum/10;
            i--;
            j--;
            sb.append(sum%10);
        }
        return sb.reverse().toString();
    }
}