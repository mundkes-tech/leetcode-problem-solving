import java.util.*;
class Solution {
    public int[] sortByBits(int[] arr) {
        Integer[] array = new Integer[arr.length];
        for(int i=0;i<arr.length;i++){
            array[i]=arr[i];
        }

        Arrays.sort(array,new Comparator<Integer>(){
            public int compare(Integer num1,Integer num2){
                int bits1=Integer.bitCount(num1);
                int bits2=Integer.bitCount(num2);

                if(bits1!=bits2){
                    return Integer.compare(bits1,bits2);
                }
                else{
                    return Integer.compare(num1,num2);
                }
            }
        });

        int[] result=new int[arr.length];
        for(int i=0;i<array.length;i++){
            result[i]=array[i];
        }
        return result;
    }
}