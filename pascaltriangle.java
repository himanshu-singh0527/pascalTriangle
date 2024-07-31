import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Solution {
    public List<List<Integer>> generate(int n) {
        List<List<Integer>> ans = new ArrayList<>();

        for (int row = 0; row < n; row++) {
            List<Integer> temp = new ArrayList<>();
            int res = 1;
            temp.add(1);

            for (int col = 1; col <= row; col++) {
                res = res * (row - col + 1) / col;
                temp.add(res);
            }
            ans.add(temp);
        }
        return ans;
    }
}

public class pascaltriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows for Pascal's Triangle: ");
        int n = sc.nextInt();
     
        Solution solution = new Solution();
        List<List<Integer>> result = solution.generate(n);

        System.out.println("Pascal's Triangle:");
        for (List<Integer> row : result) {
            System.out.println(row);
        }
    }
}
