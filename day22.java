import java.util.Scanner;

public class day22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int t = scanner.nextInt();
        char[] queue = scanner.next().toCharArray();

        for (int time = 0; time < t; time++) {
            for (int i = n - 2; i >= 0; i--) {
                if (queue[i] == 'B' && queue[i + 1] == 'G') {
                    queue[i] = 'G';
                    queue[i + 1] = 'B';
                    i--; 
                }
            }
        }
        System.out.println(new String(queue));
    }
}