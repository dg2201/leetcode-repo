class Solution {
    public boolean isAnagram(String s, String t) {
        int len1=s.length();
        int len2=t.length();
        HashMap<Character, Integer> fre1 = new HashMap<>();
        HashMap<Character, Integer> fre2 = new HashMap<>();
        for(int i=0;i<len1;i++){
            if(fre1.containsKey(s.charAt(i))){
               fre1.put(s.charAt(i),fre1.get(s.charAt(i))+1);
            }
            else{
                fre1.put(s.charAt(i), 1);
            }
        }
        for(int i=0;i<len2;i++){
            if(fre2.containsKey(t.charAt(i))){
                fre2.put(t.charAt(i),fre2.get(t.charAt(i))+1);
            }
            else{
                fre2.put(t.charAt(i), 1);
            }
        }
        if(fre1.equals(fre2)){
            return true;
        }
        else{
            return false;
        }
        

       
    }
}