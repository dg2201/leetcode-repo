import java.util.*;

class Solution {
    public boolean closeStrings(String word1, String word2) {
        int one = word1.length();
        int two = word2.length();
        if (one != two) {
            return false;
        }
        HashSet<Character> set = new HashSet<>();
        HashSet<Character> set2 = new HashSet<>();
        for (int i = 0; i < one; i++) {
            set.add(word1.charAt(i));
        }
        for (int i = 0; i < two; i++) {
            set2.add(word2.charAt(i));
        }
        if(!set.equals(set2)){
            return false;
        }
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < one; i++) {
            if(!map.containsKey(word1.charAt(i))) {
                map.put(word1.charAt(i), map.getOrDefault(word1.charAt(i), 0) + 1);
            }
            else {
                map.put(word1.charAt(i), map.get(word1.charAt(i)) + 1);
            }
        }

        HashMap<Character, Integer> map2 = new HashMap<>();
        for (int i = 0; i < two; i++) {
            if(!map2.containsKey(word2.charAt(i))) {
                map2.put(word2.charAt(i), map2.getOrDefault(word2.charAt(i), 0) + 1);

            }
            else {
                map2.put(word2.charAt(i), map2.get(word2.charAt(i)) + 1);
            }
        }
        TreeMap<Character , Integer> sortedMap = new TreeMap<>(map);
        TreeMap<Character , Integer> sortedMap2 = new TreeMap<>(map2);
        ArrayList<Integer> values1 = new ArrayList<>(sortedMap.values());
        ArrayList<Integer> values2 = new ArrayList<>(sortedMap2.values());
        Collections.sort(values1);
        Collections.sort(values2);


        // 3. Compare the sorted lists
        boolean mechanicalMatch = values1.equals(values2);
        return  mechanicalMatch;



    }
}