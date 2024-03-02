class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        if(s.length < 0) return 0;
        int result = 0;
        int cookieIndex = 0;
        int childIndex = 0;
        
        while(childIndex < g.length && cookieIndex < s.length){
            if(s[cookieIndex] >= g[childIndex]){
                childIndex++;
            }
            cookieIndex++;
        }
        return childIndex;
        // for(int i = g.length - 1; i < 0 || sIndex < 0; i--){
        //     if(g[i] <= s[sIndex]){
        //         result++;
        //         sIndex--;
        //     }
        // }
        // return result;
    }
}