package com.tperkins.app;

/**
 *  My Solution
 */
public class Palindrome {

    private static Palindrome p;

    public static void main(String[] args) {
        p = new Palindrome();
        System.out.println(p.isPalindrome("racecar"));
        System.out.println(p.isPalindrome("racecr"));
        // order taken into account
        System.out.println(p.isPalindrome("racecra"));
    }

    public Boolean isPalindrome(String word){
        for (int i = 0; i < word.length(); i++){
            if ((float) i == word.length()/2){
                break;
            }
            if (word.charAt(i) != word.charAt(word.length()-i-1)){
                return false;
            }
        }
        return true;
    }
}
