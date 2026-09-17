class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        ArrayList<Integer> list = new ArrayList<>();
        int[] visited = new int[arr1.length];

        Arrays.sort(arr1);

        for(int i=0;i<arr2.length;i++){
            for(int j=0;j<arr1.length;j++){
                if(arr2[i] == arr1[j]){
                    list.add(arr1[j]);
                    visited[j] = 1;
                }
            }
        }

        for(int i=0;i<visited.length;i++){
            if(visited[i]==0){
                list.add(arr1[i]);
            }
        }

        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;
    }
}


