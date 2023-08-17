package algocource.arraysandstrings;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseStringInArray {
    public static void main(String[] args) {
        char[] strArr = {'h','e','l','l','o'};
        char[] resArr = reverseStrArray(strArr);
        for (char c : resArr) {
            System.out.print(c + " ");
        }
    }

    private static char[] reverseStrArray(char[] s) {
        int p1 = 0;
        int p2 = s.length - 1;

        while (p1 < p2) {
            char start = s[p1];
            char tail = s[p2];
            s[p1] = tail;
            s[p2] = start;
            p1++;
            p2--;
        }

        return s;
    }
}
