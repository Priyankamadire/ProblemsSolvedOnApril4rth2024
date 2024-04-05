import java.util.*;

public class KthBeautyNum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int k = sc.nextInt();
        System.out.print(solve(s, k));
    }

    public static int solve(String s, int k) {
        int i = 0, j = 0;
        int cnt = 0;
        int a = Integer.parseInt(s);
        while (j < s.length()) {
            String p = s.substring(i, j + 1);
            int n = Integer.parseInt(p);
            if (j - i + 1 < k) {
                j++;
            } else if (j - i + 1 == k) {
                if (n != 0 && a % n == 0) {
                    cnt++;
                }
                i++;
                j++;
            }
        }
        return cnt;
    }
}