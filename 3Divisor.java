class Solution {
    public boolean isThree(int n) {
        boolean flag=false;
        int count=0;
      for(int i=1; i<=n;i++){
        if(count >=4){
            break;
        }
        if(n%i==0){
            count++;
        }
      }
      if(count==3){
        flag= true;
      } 
      return flag; 
    }
}