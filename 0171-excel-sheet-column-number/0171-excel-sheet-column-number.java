class Solution {
    public int titleToNumber(String columnTitle) {
        int result = 0;
        
        for (int i = 0; i < columnTitle.length(); i++) {
            int idx = columnTitle.length() - 1 - i; // 거꾸로 셈
            result += Math.pow(26,i) * (columnTitle.charAt(idx)-'A'+1); // 26진수라고 생각하면됨
        }
        return result;
    }
}