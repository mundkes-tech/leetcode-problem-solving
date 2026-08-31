class Solution {
    public int minDeletions(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1); 
        }

        ArrayList<Integer> frequencies = new ArrayList<>(map.values());
        Collections.sort(frequencies,Collections.reverseOrder());

        HashSet<Integer> usedfreq = new HashSet<>();

        int deletion = 0;

        for(int freq : frequencies){
            while(usedfreq.contains(freq)){
                deletion++;
                freq--;
            }
            if (freq > 0) {
                usedfreq.add(freq);
            }
        }

        return deletion;
    }
}