class Solution {
    public int findComplement(int num) {
        String binary = Integer.toBinaryString(num);

        StringBuilder binarycomplement = new StringBuilder();

        for(int i=0;i<binary.length();i++){
            char ch = binary.charAt(i);
            if(ch=='0'){
                binarycomplement.append('1');
            }
            else{
                binarycomplement.append('0');
            }
        }

        int finaldecimal = Integer.parseInt(binarycomplement.toString(),2);

        return finaldecimal;
    }
}