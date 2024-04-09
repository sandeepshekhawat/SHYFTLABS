import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem1 {
    public static int helper(List<Integer> list) {
        if (list.size() == 1)
            return 0;

        int low = 0;
        int high = 1;

        while (high < list.size() && list.get(high) != -1) {
            low = high;
            high *= 2;
        }

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (list.get(mid) == -1) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        System.out.println("Enter the elements of array separated by space, hit 0 to terminate : ");
        while (true) {
            int num = sc.nextInt();
            if (num == 0) {
                break; // Terminate at 0 
            }
            list.add(num);
        }

        System.out.println("The answer index is :" + helper(list));

        sc.close();
    
    }
}