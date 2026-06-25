import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class RotateArray {
    public void rotate(int[] nums, int k) {
        List<Integer> list = new ArrayList<>();
        for(int x : nums){
            list.add(x);
        }
        k = k % nums.length;
        Collections.reverse(list);
        List<Integer> sublist1 = list.subList(k, nums.length);
        List<Integer> sublist2 = list.subList(0, k);
        Collections.reverse(sublist2);
        Collections.reverse(sublist1);
        for(int i = 0 ; i<nums.length ;i++){
            nums[i]=list.get(i);
        } 
    }
}