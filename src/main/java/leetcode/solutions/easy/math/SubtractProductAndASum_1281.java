package leetcode.solutions.easy.math;

public class SubtractProductAndASum_1281 {
    public static void main(String[] args) {
//        int input = 234;
        int input = 4421;
        int res = subtractProductAndSum(input);
        System.out.println(res);
    }

    private static int subtractProductAndSum(int n) {
        int sum = 0;
        int product = 1;
        while (n > 0) {
            int curr = n % 10;
            sum = sum + curr;
            product = product * curr;
            n = n / 10;
        }
        return product - sum;
    }


    // Brute force solution
    private static int subtractProductAndSum1(int n) {
        String[] strArr = String.valueOf(n).split("");

        int sum = 0;
        int product = 1;
        for (String j : strArr) {
            sum = sum + Integer.parseInt(j);
            product = product * Integer.parseInt(j);
        }
        return product - sum;
    }

}
