class Solution {
    public long numberOfSubstrings(String s) {
        long res = 0;
        HashMap<Character, Long> map = new HashMap<>();
        for(Character c: s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0L) + 1);
        }

        for(Map.Entry<Character, Long> entry : map.entrySet()){
            long count = entry.getValue();
            res += ((count) * (count-1)) / 2;
        }
        return res+s.length();
    }
}