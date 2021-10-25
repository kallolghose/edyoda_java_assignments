package practice.lessons.springlesson;

/*
Palindrome
anna =
Spell from front it spells a n n a
Spell from backwards it spells a n n a
 */
public class Palindrome {

    /**
     * Function to perform palindrome of a string
     * @param str
     */
    public void checkPalindrome(String str){
        int length = str.length();
        System.out.print("Length : " + length);

        //1. Reverse the given string
        String reverse = "";
        for(int i=length-1; i>=0; i--){
            reverse = reverse + str.charAt(i);
        }
        System.out.println("Reverse : " + reverse);

        //2. Comparing the strings
        if(reverse.equals(str)){
            System.out.println("It is a palindrome");
        }
        else{
            System.out.println("It is NOT a palindrome");
        }
    }

    /**
     * Function to perform palindrome of an integer (number)
     * @param number
     */
    public void checkPalindrome(int number){
        int rev = 0;
        int temp = number;
        while(number > 0){
            int remainder = number % 10;
            rev = rev * 10 + remainder;
            number = number / 10;
        }
        System.out.println("Reverse : " + rev);
        if(rev == temp){
            System.out.println("It is a palindrome");
        }
        else{
            System.out.println("It is NOT a palindrome");
        }
    }

    public static void main(String[] args) {
        Palindrome palindrome = new Palindrome();
        palindrome.checkPalindrome(123);
    }

}
