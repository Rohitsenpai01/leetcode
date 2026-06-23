import java.util.HashSet;

public class ContainsDuplicate {

    public boolean containsDuplicate(int[] nums) {
        HashSet <Integer> set = new HashSet<>();
        for (int x : nums) {
            if (!set.contains(x)) {
                set.add(x);
                continue;
            }
            return true;
        }
        return false;
    }

}
