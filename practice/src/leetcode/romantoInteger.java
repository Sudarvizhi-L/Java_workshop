package leetcode;

import java.util.Map;

/*
Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
For example, 2 is written as II in Roman numeral, just two ones added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.
*/

public class romantoInteger {
    public int romanToInt(String s) {
        Map<Character, Integer> roman = Map.of(
                'I', 1, 'V' , 5, 'X',10, 'L' , 50, 'C' , 100, 'D' , 500, 'M' , 1000
        );
        int len = s.length();
        int ans = 0;
        for(int i = 0; i < len; i++){
            int current = roman.get(s.charAt(i));
            int next = ((i + 1) < len) ? roman.get(s.charAt(i+1)) : 0;
            if(current < next){
                ans -= current;
            }
            else{
                ans += current;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        romantoInteger rm = new romantoInteger();
        System.out.println(rm.romanToInt("XIII"));
    }
}
