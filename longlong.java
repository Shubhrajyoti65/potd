import java.util.*;
public class longlong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n-->0){
            int x= sc.nextInt();
            int[] arr = new int[x];
            for(int i =0; i<x;i++){
                arr[i]=sc.nextInt();
            }
        long sum=0;
        int count=0 ;
        boolean check = false;
        for(int i =0; i<x;i++){
            if(arr[i] < 0){ 
                arr[i]= arr[i]*(-1);
                if(!check){ 
                    count++;
                    check= true;
                }
            } else if (arr[i] > 0) {
                check= false;
            }  
            sum += arr[i];  
        } 
        System.out.println(sum+" "+count);
    }
    sc.close();
    }
}
