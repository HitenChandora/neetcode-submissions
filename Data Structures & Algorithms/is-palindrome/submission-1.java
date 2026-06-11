class Solution {
    public boolean isPalindrome(String s) {
        char[] input = s.toCharArray();
        int front = 0;
        int back = input.length-1;

        while(front < back){
            while(front < back && !Character.isLetterOrDigit(input[front])){
                front++;
            }
            while(front < back && !Character.isLetterOrDigit(input[back])){
                back--;
            }
            if(Character.toLowerCase(input[front]) != Character.toLowerCase(input[back])){
                return false;
            }

            front++;
            back--;
        }
        return true;
    }
}
