class KthMissing{
    static int kthMissing(String str , int kth){
        String []str1 = str.split(str);
        int []arr = new int[str1.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(str1[i]);
        }
        int k =0;
        for (int i = 0; i < arr.length; ) {
            if (arr[i] != (i+1) && arr[i] > (i+1)) {
                ++k;
            }else{
                i++;
            }
            if(kth == k){
                return i;
            }
        }
        return 1;
    }
    public static void main(String[] args) {
        
    }
}