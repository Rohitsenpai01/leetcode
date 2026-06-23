import java.util.Scanner;

class DatetoBinary{
    String converttoBinary(String str){
        String []arr = str.split("-");
        for(int i = 0 ; i < arr.length ; i++){
            int n = Integer.parseInt(arr[i]);
            arr[i] = Integer.toBinaryString(n);
        }
        return String.join("-",arr);
    }

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        DatetoBinary b = new DatetoBinary();
        System.out.println(b.converttoBinary(str));
    }
}