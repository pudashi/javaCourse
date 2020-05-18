package practice;

public class Plus {
        public static void main(String[] args) {
            int a=231;
            int b=525;
            int temp;
            if (a < b) {
                temp = a;
                a = b;
                b = temp;
            }

            System.out.println(maxCommon(a,b));


        }
        public static int maxCommon(int a,int b){
            int r=a%b;
            if(r==0){
                return b;
            }else{
                return maxCommon(b,r);
            }
        }
    }

