class Solution {
    public int minPartitions(String n) {
        int x = n.length();
        int max=0;
    for(int i =0; i<x;i++){
        if(n.charAt(i)-'0' > max){
            max=n.charAt(i)-'0';;
        }
    } 
    return max ;
    }
}
// Time complexity= 4ms.