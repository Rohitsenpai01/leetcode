class MaxConsecutiveOnes {
    public int maxConsecutiveOnes(int[] nums) {
        int count = 0 , max = 0;
        for (int i : nums) {
            count = (i == 1) ? ++count : 0;
            if (max < count) {
                max = count;
            }
        }
        return max;
    }
}