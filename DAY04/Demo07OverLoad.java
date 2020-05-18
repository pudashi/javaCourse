package DAY04;
//方法的重载：方法名称都相同，但参数不同。
public class Demo07OverLoad {
    public static void main(String[] args) {
//        System.out.println(Sum(10,20));
//        System.out.println(Sum(10,20,30));
//        System.out.println(Sum(10,20,30,40));
        System.out.println(Sum(10,20));
        System.out.println(Sum(10,20,30));
        System.out.println(Sum(10,20,30,40));
    }
    public static int Sum(int a,int b){
        return a+b;
    }
    public static int Sum(int a,int b,int c){
        return a+b+c;
    }
    public static int Sum(int a,int b,int c,int d) {
        return a+b+c+d;
    }
}
