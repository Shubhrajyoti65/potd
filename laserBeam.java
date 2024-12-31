class Solution {
    public int numberOfBeams(String[] bank) {
        int NumberOfBeams=0 ,previous=0;
        for(int i=0;i<bank.length;i++){
           int count=0;
            for(int j=0; j<bank[i].length();j++){
               if(bank[i].charAt(j) == '1')
               count++;
            }
            NumberOfBeams += previous*count;
            if(count !=0){
           previous=count;
           }
        }
        return  NumberOfBeams;
    }
}