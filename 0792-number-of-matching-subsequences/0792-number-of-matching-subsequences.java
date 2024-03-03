class Solution {
    public int numMatchingSubseq(String s, String[] words) {
        int result = 0;
        HashMap<String, Integer> map = new HashMap<>();
        for(String str : words){
            map.put(str, map.getOrDefault(str, 0) + 1);
        }
        
        for (String word : map.keySet()) {
            if (isSubsequence(word, s)) {
                result += map.get(word);
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