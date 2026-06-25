class ProductAndSum {
    public int subtractProductAndSum(int n) {
        int pro = 1 , sum =0 , rem;
        while(n > 0){
            rem = n %10;
            pro *= rem;
            sum += rem;
            n /= 10;
        }
        return pro - sum;
    }
}
