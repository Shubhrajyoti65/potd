import java.util.*;

public class pangram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        if (n < 26) {
            System.out.println("NO");
            return;
        }
        int[] check = new int[26];
        s = s.toLowerCase();
        int count = 0;
        for (char c : s.toCharArray()) {
            if ('a' <= c && c <= 'z') {
                int index = c - 'a';
                if (check[index]==0) {
                    check[index] = 1;
                    count++;
                }
            }
        }
        if (count == 26) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        sc.close();
    }
}

