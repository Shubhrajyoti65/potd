import java.util.Scanner;

public class interval {
    public static int longestInterval(long x) {
        int count = 0;
        for (long i = 1; i <= x; i++) {
            if (x % i == 0) {
                count++;  
            } else break;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int TC = sc.nextInt();
        while (TC-- > 0) {
            long n = sc.nextLong();
            System.out.println(longestInterval(n));
        }
        sc.close();
    }
}
  