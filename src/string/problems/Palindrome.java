package string.problems;

public class Palindrome {

    public static void main(String[] args) {

        /*
          If a String is reversed and it remains unchanged, that is called a palindrome.
            Example: MOM, DAD, MADAM are palindromes.

            Write a method to check if a given String is a palindrome or not.
         */
        // Palindrome = A word that is the same forward and backwards (MOM)

            System.out.println(isPalindrome("racecar"));
        }

        public static boolean isPalindrome(String text) {
            char[] textArray = text.toLowerCase().toCharArray();
            char[] reverseArray = new char[textArray.length];
            boolean flag = false;


            for (int i = textArray.length - 1; i >= 0; i--) {
                reverseArray[(textArray.length - 1) - i] = textArray[i];
            }
            int i = 0;

            for (char c : textArray) {
                if (c != reverseArray[i]){
                    flag = false;
                } else {
                    flag = true;
                }
                i++;
            }

            return flag;
        }


    }




