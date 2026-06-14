import java.util.HashMap;

class Solution {
    public boolean checkInclusion(String s1, String s2) {
        HashMap<Character, Integer> charCountMap = new HashMap<>();
        HashMap<Character, Integer> charCountMap2 = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            if (!charCountMap.containsKey(s1.charAt(i))) {
                charCountMap.put(s1.charAt(i), 1);

            }
            else {
                charCountMap.put(s1.charAt(i), charCountMap.get(s1.charAt(i)) + 1);
            }
        }
        for (int i = 0; i <= s2.length()-s1.length(); i++) {
            String result = s2.substring(i, i+s1.length());
            charCountMap2.clear();
            for (int j = 0; j < result.length(); j++) {
                if (!charCountMap2.containsKey(result.charAt(j))) {
                    charCountMap2.put(result.charAt(j), 1);

                }
                else {
                    charCountMap2.put(result.charAt(j), charCountMap2.get(result.charAt(j)) + 1);
                }
            }
            if(charCountMap.equals(charCountMap2)){
                return true;
            }
            
        }
        return false;

    }
}