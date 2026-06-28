class ReverseString {
    public void reverseString(char[] s) {
        int start =0 , end =s.length;
        while (end>=start) {
            char temp =s[end];
            if(end == start && s.length % 2==1){
                continue;
            }
            s[end] = s[start];
            s[start] = temp;
            --end;
            ++start;
        }
    }
    public static void main(String[] args) {
        char []s = {'r','o','h','i','t'};
        ReverseString r = new ReverseString();
        r.reverseString(s);
        System.out.println(s);
    }
}