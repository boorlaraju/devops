import java.util.Scanner;

public class EqualMeanReduction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();  // Number of test cases
        
        while (t-- > 0) {
            int n = sc.nextInt();  // Length of array
            int x = sc.nextInt();  // Target value
            
            int[] a = new int[n];
            int sum = 0;
            
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                sum += a[i];
            }
            
            // If the mean of the array equals x, it's possible
            if (sum == x * n) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            
            System.out.println("hello world");
        }
        
        sc.close();
    }
}
