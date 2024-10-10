import java.util.Scanner;

public class LinearSearch {
    public LinearSearch() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of Element you want: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " values");

        int target;
        for(target = 0; target < n; ++target) {
            arr[target] = sc.nextInt();
        }

        System.out.println("Enter the value of target Element: ");
        target = sc.nextInt();

        for(int i = 0; i < n; ++i) {
            if (arr[i] == target) {
                System.out.println("Element found at index: " + i);
                break;
            }

            System.out.println("Element not found at index: " + i);
        }

    }
}
