import java.util.*;

public class B1181 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        sc.nextLine();

        String[] s = new String[N];

        for (int i = 0; i < N; i++) {
            s[i] = sc.nextLine();
        }

        Arrays.sort(s, (a, b) -> {
            if (a.length() == b.length()) return a.compareTo(b);
            return a.length() - b.length();
        });

        for (int i = 0; i < N-1; i++) {
            if (!s[i].equals(s[i+1])) {
                System.out.println(s[i]);
            }
        }
        System.out.println(s[N-1]);

    }
}