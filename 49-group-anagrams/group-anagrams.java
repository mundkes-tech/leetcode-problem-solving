class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();
        for(String str : strs){
            char[] chars = str.toCharArray();
            Arrays.sort(chars);

            String sortedkey = new String(chars);

            if(!map.containsKey(sortedkey)){
                map.put(sortedkey,new ArrayList<>());
            }

            map.get(sortedkey).add(str);

        }

        return new ArrayList<>(map.values());
    }
}