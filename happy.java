class Solution {
    public boolean isHappy(int n) {
       HashSet<Integer>set= new HashSet<>();
       while(true){
        int sum=0;
        while(n>0){
            int y = n%10;
            sum +=y*y;
            n=n/10;
        }
        n=sum;
        if(n==1){
            return true;
        }
        if(set.contains(n)){
            return false;
        }
        set.add(n);
       }
    }
}