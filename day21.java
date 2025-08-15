public class day21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] coins = new int[n];
        int totalSum = 0;

        for (int i = 0; i < n; i++) {
            coins[i] = scanner.nextInt();
            totalSum += coins[i];
        }

        Arrays.sort(coins); 
        int yourSum = 0;
        int count = 0;

    
        for (int i = n - 1; i >= 0; i--) {
            yourSum += coins[i];
            count++;
            if (yourSum > totalSum / 2) {
                System.out.println(count);
                return;
            }
        }
    }
}