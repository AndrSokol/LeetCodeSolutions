package other;

public class ArrayBorder {
    public static void main(String[] args) {
//        int[][] arr = {
//                {1, 2, 3, 4},
//                {5, 6, 7, 8},
//                {9, 10, 11, 12},
//                {13, 14, 15, 16}
//        };
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        printPath(arr);
    }

    private static void printPath(int[][] arr) {
        // print top
        for (int i = 0; i < arr[0].length; i++) {
            int element = arr[0][i];
            System.out.println(element);
        }

        //print right
        if (arr.length > 2) {
            for (int i = 1; i < arr.length; i++) {
                System.out.println(arr[i][arr[i].length - 1]);
            }
        }
        // print bottom
        int shift = arr.length > 2 ? 1 : 0;
        for (int i = shift; i < arr[arr.length - 1].length; i++) {
            int element = arr[arr.length - 1][arr[arr.length - 1].length - 1 - i];
            System.out.println(element);
        }
        // print left
        if (arr.length > 2) {
            for (int i = 1; i < arr.length - 1; i++) {
                System.out.println(arr[arr.length - 1 - i][0]);
            }
        }
    }
}
