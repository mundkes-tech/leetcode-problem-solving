class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        ArrayList<Integer> list = new ArrayList<>();
        int[] freq = new int[1001];

        for(int i=0;i<arr1.length;i++){
            freq[arr1[i]]++;
        }

        for(int i=0;i<arr2.length;i++){
            while(freq[arr2[i]]!=0){
                list.add(arr2[i]);
                freq[arr2[i]]--;
            }
        }

        for(int i=0;i<freq.length;i++){
            while(freq[i]!=0){
                list.add(i);
                freq[i]--;
            }
        }

        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;
    }
}


