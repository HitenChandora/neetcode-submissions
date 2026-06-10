class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for(int i=0; i<strs.length; i++){
            char[] c = strs[i].toCharArray();
            Arrays.sort(c);
            String sorted = new String(c);
            map.putIfAbsent(sorted ,new ArrayList<>());
            map.get(sorted).add(strs[i]);
        }
        return new ArrayList<>(map.values());   
    }
}
