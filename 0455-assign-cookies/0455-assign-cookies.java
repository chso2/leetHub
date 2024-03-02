class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        if(s.length < 0) return 0;
        int cookieIndex = 0;
        int childIndex = 0;
        
        for (int i = 0; i < s.length && childIndex < g.length; i++) {
            if (s[i] >= g[childIndex]) {
                childIndex++;
            }
        }
        return childIndex;
    }
}