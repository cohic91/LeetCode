class Solution {
    public int romanToInt(String s) {
        Map<String, Integer> romanMap = new HashMap<String, Integer>() {
            {
                put("M", 1000);
                put("CM", 900);
                put("D", 500);
                put("CD", 400);
                put("C", 100);
                put("XC", 90);
                put("L", 50);
                put("XL", 40);
                put("X", 10);
                put("IX", 9);
                put("V", 5);
                put("IV", 4);
                put("I", 1);
            }
        };
        
        int strLength = s.split("").length;
        int i = 0;
        int result = 0;
        
        while(i < strLength) {
            if(i != (strLength - 1) && romanMap.containsKey(s.substring(i, i+2))) {
                result += romanMap.get(s.substring(i, i+2));
                i+=2;
            } else {
                result += romanMap.get(s.substring(i, i+1));
                i+=1;
            }
        }
        
        return result;
    }
}