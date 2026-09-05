class Solution {
    public int myAtoi(String s) {
        int i = 0, sign = 1;
        long num = 0;
        s = s.trim();
        if (s.isEmpty())
            return 0;
        if (s.charAt(i) == '-' || s.charAt(i) == '+') {
            if (s.charAt(i) == '-')
                sign = -1;
            i++;
        }
        while (i < s.length() && Character.isDigit(s.charAt(i))) {
            num = (num * 10) + s.charAt(i) - '0';
            if (num * sign > Integer.MAX_VALUE)
                return Integer.MAX_VALUE;
            else if (num * sign < Integer.MIN_VALUE)
                return Integer.MIN_VALUE;
            i++;
        }
        return (int) (sign * num);
    }
}