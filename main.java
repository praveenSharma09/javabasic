import java.sql.SQLOutput;
import java.util.*;
class Test
{
    public static void main(String []args)
    {
        System.out.println("My First Java Program.");

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 1; i<=10; i++){
            int result =  N*i;
            System.out.println(N+ " * " + i + " = " +  result);

        }
        System.out.println();
        System.out.println("thanks");
    }

}