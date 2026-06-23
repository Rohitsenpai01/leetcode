// Balanced Segment Analyzer

import java.util.*;


public class Day04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size : ");
        int n = sc.nextInt();
        
        int []arr = new int[n];
        int count = 0;
        System.out.println("Enter elements : ");
        for(int j = 0; j < n ; j++){
            arr[j] = sc.nextInt();
        }

        for(int i = 0; i < n ; i++)
        {
            int temp = i -1, lsum = 0, rsum = 0;

            while(temp >= 0){
                lsum = lsum + arr[temp];
                temp--;
            }

            temp = i +1;

            while(temp < n){
                rsum = rsum + arr[temp];
                temp++;
            }

            if(lsum == rsum ){
                count++;
            }
        }

        System.out.println(count);
        sc.close();
    }
}