class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxcount = 0;
        for (int i = 0; i < sentences.length; i++) {
            int count = 0;
            boolean inword = false;
            for (int j = 0; j < sentences[i].length(); j++) {
                char word = sentences[i].charAt(j);

                if (word != ' ') {
                    if (!inword) {
                        count++;
                        inword = true;
                    }
                } else {
                    inword = false;
                }
            }
            maxcount = Math.max(count, maxcount);
        }
        return maxcount;
    }
}