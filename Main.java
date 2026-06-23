// Corporate Talent Screening System

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n;
        n = sc.nextInt();

        int[] arr = new int[n];
        int sum = 0;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        int count = 0;

        int max = arr[0];
        for (int y : arr) {
            if (y > max) {
                max = y;
            }
        }

        for (int x : arr) {

            int digisum = 0, rem, temp;

            temp = x;

            while (temp > 0) {
                rem = temp % 10;
                digisum += rem;
                temp /= 10;
            }

            temp = 1;

            for (int i = 2; i <= x / 2; i++) {
                if (x % i == 0) {
                    temp = 0;
                    break;
                }
            }

            if (map.get(x) == 1 &&
                digisum % 2 == 0 &&
                temp == 1 &&
                x > (sum / n) &&
                x != max) {

                count++;
            }
        }

        System.out.print(count);
    }
}