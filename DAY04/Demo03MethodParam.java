package DAY04;
/*
有参数：小括号内有内容。当一个方法需要数据内容才能完成任务时，就是有参数。
无参数：小括号内不需要任何数据条件，自己能够独立完成任务，就是无参数。
 */
public class Demo03MethodParam {
    public static void main(String[] args) {
        Method01(10,20);
        System.out.println("===========");
        System.out.println(Method01(10,20));
        System.out.println("===========");
        Method02();
    }
    public static int Method01(int a, int b){
        int result = a * b;
        System.out.println("结果是"+result);
        return result;
    }
    public static void Method02(){
            for (int i = 0; i < 10; i++) {
            System.out.println("HelloWorld!!!"+i);
        }
    }
}
