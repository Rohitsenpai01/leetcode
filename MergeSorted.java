class MergeSorted {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] arr = new int[m];
        int index = 0, j = 0, k = 0;
        for (int i = 0; i < m; i++) {
            arr[i] = nums1[i];
        }
        while (j < m && k < n) {

            if (arr[j] < nums2[k]) {
                nums1[index] = arr[j];
                j++;
                index++;
            } else {
                nums1[index] = nums2[k];
                k++;
                index++;
            }
        }
        while (j < m) {
            nums1[index++] = arr[j++];
        }

        while (k < n) {
            nums1[index++] = nums2[k++];
        }
    }
}