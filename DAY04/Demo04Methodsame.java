package DAY04;
/*
定义一个方法判断两个数字是否相同
 */
public class Demo04Methodsame {
    public static void main(String[] args) {
        System.out.println(issame(10,20));
        System.out.println(issame(20,20));
    }
    public static boolean issame(int a,int b){
        boolean same;
//        if(a==b){
//            same = true;
//        }else {
//            same = false;
//        same = a == b ? true : false;
          same = a == b;
          return same;
        }
    }
