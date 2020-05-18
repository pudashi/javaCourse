package DAY04;

public class Demo02 {
    public static void main(String[] args) {
//      单独调用
        sum(10,20);
        System.out.println("============================");
//      打印调用System.out.println(方法名称（参数）)；
        System.out.println(sum(10,20));
        System.out.println("============================");
//      赋值调用:数据类型 变量名称 = 方法名称（参数）；
        int number = sum(20,30);
        System.out.println("变量的值"+number);
    }
//  void只能单独调用。
    public static int sum(int a,int b) {
        System.out.println("方法执行啦！！");
        int result = a + b;
        return result;
    }
}
