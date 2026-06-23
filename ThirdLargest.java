// Scholarship Ranking System

import java.util.*;
import java.io.*;

public class ThirdLargest {

    static int thirdLargest(String str) {
        String[] arr = str.split(" ");

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            int num = Integer.parseInt(arr[i]);

            if (!list.contains(num)) {
                list.add(num);
            }
        }

        if (list.size() < 3) {
            return 0;
        }

        int max = Collections.max(list);
        list.remove(Integer.valueOf(max));

        max = Collections.max(list);
        list.remove(Integer.valueOf(max));

        return Collections.max(list);
    }

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        int ans = thirdLargest(str);

      
            System.out.println(ans);
        

        sc.close();
    }
}