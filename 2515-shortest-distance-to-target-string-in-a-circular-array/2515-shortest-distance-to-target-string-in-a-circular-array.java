class Solution {
    public int closetTarget(String[] words, String target, int startIndex) {
        
        // max array length = 100
        // each strng value <= 100, not empty
        // 1) equals string - max loop 100
        // 2) findIndex
        
        //words.findIndex(target, startIndex)
        int leftIndex = startIndex;
        int rightIndex = startIndex;
        int leftCount = 0;
        int rightCount = 0;
        
        while(leftCount < words.length || rightCount < words.length){
            if(words[leftIndex].equals(target)) {
                return leftCount;
            }
            if(words[rightIndex].equals(target)) {
                return rightCount;
            }
            leftIndex = leftIndex > 0 ? leftIndex - 1 : words.length - 1;
            rightIndex = rightIndex < words.length - 1 ? rightIndex + 1 : 0;            
            
            if (leftCount < words.length) leftCount++;
            if (rightCount < words.length) rightCount++;
        }
        return -1;
    }
}