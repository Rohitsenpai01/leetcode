class DateToBinary{
    int convertToBinary(String str){
        String []arr = str.split("-");
        for(int i = 0 ; i < str.length ; i++){
            int n = Integer.parseInt(arr[i]);
            arr[i] = Integer.toBinary(n);
        }
        return String.join("-",arr);
    }

    public static void Main(String [] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(convertToBinary(str));
    }
}