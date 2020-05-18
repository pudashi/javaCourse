package DAY04;

public class Demo06MethodPrint {
    public static void main(String[] args) {
        PrintCount(10);
    }
    public static void PrintCount(int num){
        for (int i = 0; i < num; i++) {
            System.out.println("HelloWorld!!！"+(i+1));
        }
    }
}
