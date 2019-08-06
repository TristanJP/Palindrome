package com.tperkins.app;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class PalindromeTest {

    Palindrome palindrome;

    @Before
    public void setup(){
        palindrome = new Palindrome();
    }
    
    @Test
    public void valid(){
        assertTrue(palindrome.isPalindrome("racecar"));
    }

    @Test
    public void valid2(){
        assertTrue(palindrome.isPalindrome("raccar"));
    }

    @Test
    public void valid3(){
        assertTrue(palindrome.isPalindrome("rr"));
    }

    @Test
    public void valid4(){
        assertTrue(palindrome.isPalindrome("r"));
    }

    @Test
    public void invalid(){
        assertTrue(!palindrome.isPalindrome("racerac"));
    }

    @Test
    public void invalid2(){
        assertTrue(!palindrome.isPalindrome("meh"));
    }

    @Test
    public void invalid3(){
        assertTrue(!palindrome.isPalindrome("racetcar"));
    }

    @Test
    public void invalid4(){
        assertTrue(!palindrome.isPalindrome("racettcar"));
    }

}
