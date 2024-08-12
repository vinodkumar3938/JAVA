package programs;

import java.util.*;
import java.lang.*;

class Solution {
    public int solution(int[] k) {
        int minPeople = 0;
        int[] count = new int[10000]; // assuming max value in asked array is 10^4

        for (int i = 0; i < k.length; i++) {
            minPeople += k[i] + 1;
            count[k[i]]++;
        }

        for (int i = 0; i < 10000; i++) {
            if (count[i] > 1) {
                minPeople -= count[i] - 1;
            }
        }

        return minPeople;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] components = sc.nextLine().split(" ");
        int[] k = Arrays.stream(components).mapToInt(Integer::parseInt).toArray();
        int output = new Solution().solution(k);
        System.out.println(output);
    }
}
