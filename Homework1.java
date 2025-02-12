import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Main m=new Main();
        int[] arr={1,2,3,0};
        m.calculator(arr);
        System.out.println(m.isPalin("1001"));
    }
    public void calculator(int[] arr) {
        Arrays.sort(arr);
        int sum = 0;
        int len = arr.length;
        for (int x : arr) {sum += x;}
        double ave = sum / len;
        System.out.println("Sum:" + sum + " Average:" + ave + " Min:" + arr[0] + " Max:" + arr[len-1]+" Min2:"+arr[1]+" Max2:"+arr[len-2]);
    }
    public boolean isPalin(String input){
        String str=input.replaceAll("[, ]","");
        int len=str.length();
        for(int i=0; i<len/2; i++){
            if(str.charAt(i)!=str.charAt(len-i-1))
                return false;
        }return true;
    }
}