import java.util.*;
public class PermutationSwap {
public static int gcd(int a, int b) {
    while (b != 0) {
        int temp = b;
        b = a % b;
        a = temp;
    }
    return a;
}
    public static int sortArray(int arr[]){
        int MaxCount=0, count=0;
        for(int i=0;i<arr.length;i++){
            if (arr[i] != (i+1)) {
                int temp =arr[i];
                arr[i]=arr[(temp-1)] ;
                arr[(temp-1)] =temp;
                count= Math.abs(temp-(i+1));         
            }
            MaxCount=gcd(MaxCount, count);
        }
        return MaxCount;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int TC= sc.nextInt();
        while(TC-->0){
            int n= sc.nextInt();
            int[] arr= new int[n];
            for(int i=0;i<n;i++){
                arr[i]= sc.nextInt();
            }
           System.out.println( sortArray(arr));
        }
    }
}