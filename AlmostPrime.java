import java.util.*;
public class AlmostPrime {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int num = sc.nextInt(); 
      int almost=0;
      for(int n=1;n<=num;n++){
      int count = 0;
      for(int i =1; i<=n; i++){
        if(n%i==0){
            int c=0;
            for(int j =1 ;j<=i;j++ ){
                  if(i%j==0){
                    c++;
                  }
            }
            if(c==2) count++;
        }
      }
      if (count==2) almost++;
    }
       System.out.println(almost);
    }
}
