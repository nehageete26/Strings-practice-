# Capitalize the title 

# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
Split the title into individual words, then process each word based on its length:
Length <= 2 → convert the whole word to lowercase.
Length > 2 → capitalize the first character and lowercase the remaining characters.
Append each processed word to the StringBuilder.

# Approach
<!-- Describe your approach to solving the problem. -->
1. Split the string using spaces.
2. Traverse every word.
3. Apply the function for each string word.
4. Check if length of string is <= 2 then convert whole string to lowercase else only convert first letter uppercase and rest lowercase
5. Append a space after each word.
6. Remove the extra space using trim().

# Complexity
- Time complexity: O(N)
<!-- Add your time complexity here, e.g. $$O(n)$$ -->

- Space complexity: O(N)
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```java []
class Solution {
    StringBuilder sb = new StringBuilder();
    String capital(String s){
        if (s.length() <= 2) sb.append(s.toLowerCase());
        else {sb.append(Character.toUpperCase(s.charAt(0)));
        for(int i=1;i<s.length();i++){
        sb.append(Character.toLowerCase(s.charAt(i)));
        }
        }
        sb.append(" ");
        return sb.toString().trim();
    }
    public String capitalizeTitle(String title) {
        String arr[] = title.split("\\s");
        for(int i=0;i<arr.length;i++){
            capital(arr[i]);
        }
        return sb.toString().trim();
    }
}
```