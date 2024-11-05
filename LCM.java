import java.util.*;
public class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a  = sc.nextInt();
        int b = sc.nextInt();
      //  int res = printlcm(a,b);
        int res  = printgcd(a,b);
        System.out.print(res+" ");

    }

    public static int printlcm(int a ,int b) {
        int x = Math.max(a,b);
        int y = a*b;
        int res = x;
        for(int i =x; i<=y;i++){
            if(i%a==0 && i%b==0){
                res = i;
                break;
            }
        }

        return res;

    }

    public static int printgcd(int a , int b) {
        int res = 1;
        int x  = Math.min(a,b);
        for (int i =1; i<=x; i++){
            if (a%i==0 && b %i==0){
                res =i;
            }
        }
        return res;

    }
}
