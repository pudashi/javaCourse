package DAY04;
//方法调用：1.先后顺序无所谓
//           2.必须同等级，不能在一个方法里定义另一个
//           3.自己不会执行，需调用

public class Demo01 {
    public static void main(String[] args) {
        printMethod(args);
    }
    public static void printMethod(String[] args) {
        for (int j = 0; j < 5; j++) {
            for (int i = 0; i < 20; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
