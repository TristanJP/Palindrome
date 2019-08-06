package online.src.main;

import java.util.HashMap;

public class Solution {

    private static Solution s;

    public static void main(String[] args) {
        s = new Solution();
        System.out.println(s.canPermutePalindrome("racecar"));
        System.out.println(s.canPermutePalindrome("racecr"));
        // online solution fails to account for order of letters
        System.out.println(s.canPermutePalindrome("racecra"));
    }

    public boolean canPermutePalindrome(String s) {
        HashMap < Character, Integer > map = new HashMap < > ();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        int count = 0;
        for (char key: map.keySet()) {
            count += map.get(key) % 2;
        }
        return count <= 1;
    }

}