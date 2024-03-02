class Solution {
    public int numMatchingSubseq(String s, String[] words) {
        int result = 0;
        for (String word : words) {
            if (isSubsequence(word, s)) {
                result++;
            }
        }
        return result;
    }
    
    private boolean isSubsequence(String word, String s) {
        int index = 0;
        for (char c : word.toCharArray()) {
            index = s.indexOf(c, index); // 문자열 s에서 문자 c의 인덱스를 찾음
            if (index == -1) {
                return false; // 문자열 s에 문자 c가 없으면 서브시퀀스가 아님
            }
            index++; // 다음 문자를 검색하기 위해 인덱스 증가
        }
        return true;
    }
}