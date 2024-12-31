import java.util.*;
public class  NewYear {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int prob = sc.nextInt();
        int time = sc.nextInt();
        int rest=240-time;
        int restTime=0 , count=0;
        for(int i=1 ; i<=prob ; i++){
            restTime += i*5;
            if(restTime<=rest){
                count++;
            }else{
                break;
            }
        }

System.out.println(count);
sc.close();
    }
}
