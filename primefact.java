import java.util.*;
 class primefact {

   public static int prntfactor(int n ){
       // print factor of n by calling function
       for(int div=2; div*div<n; div++) {
           while (n % div == 0) {
               n = n / div;
               System.out.print(div+ " ");
           }
       }
       if(n!=1)
           System.out.print(n);
        return n;

   }
    public static void main(String args[]){
        Scanner sc  =  new Scanner(System.in);
        int n = sc.nextInt();
        prntfactor(n);
        System.out.println();
    }
 }