class Solution {

        private static boolean isvowel(char arr){
            if(arr == 'a'|| arr == 'e' || arr == 'i' || arr == 'o' || arr == 'u' || 
            arr == 'A' || arr == 'E' || arr == 'I' || arr == 'O' || arr == 'U') 
            return true;
            else return false;
        }

    public String reverseVowels(String s) {
        char arr[] = s.toCharArray();
        int start = 0, end = arr.length-1;
        while(start < end){
            if(!isvowel(arr[start])) start ++;
            else if(!isvowel(arr[end])) end --;
            else{
                char temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start ++;
                end --;
            }
        }
        return new String(arr);
    }
}