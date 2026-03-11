class Solution {
    public int bitwiseComplement(int n) {
        String binary = Integer.toBinaryString(n);

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