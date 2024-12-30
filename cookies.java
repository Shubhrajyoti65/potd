class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int count=0 ,j=0;
        while(count< g.length&&j<s.length){
                if( g[count]<=s[j]){
                    count++;
                }
                j++;
            }
        return count;
    }
}