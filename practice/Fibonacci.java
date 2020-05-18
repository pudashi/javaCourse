package practice;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibonacci(20));
    }
    public static int fibonacci(int n){
        if(n <= 0){
            System.out.println("输入值错误");
            return 0;
        }else
            if(n==1||n==2){
                return 1;
            }else{
                return fibonacci(n-1)+fibonacci(n-2);
            }
    }
}
