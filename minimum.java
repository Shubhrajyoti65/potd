class Solution {
    public int minimumMoves(String s) {
       int step =0 , i=0;
       while(i<s.length()){
        if(s.charAt(i) == 'X'){
            i+=3;
            step++;
        }else i++;
       }
       return step;
    }
}
//time complexity= 1 ms