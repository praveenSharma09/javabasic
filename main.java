cd import java.sql.SQLOutput
//class Test
//{
//    public static void main(String []args)
//    {
//        System.out.println("My First Java Program.");
//
//        Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt();
//        for (int i = 1; i<=10; i++){
//            int result =  N*i;
//            System.out.println(N+ " * " + i + " = " +  result);
//
//        }
//        System.out.println();
//        System.out.println("thanks");
//    }
//}
//nxt code

class quest {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] numbers = new int[size];
        //input
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }
        decreamentarnumb(numbers);
        //output : here we re again iterate the for loop that prints our return statement

        for(int  i = 0 ; i < size; i++){
            System.out.print(numbers[i]+" ");}

        System.out.println();


    }


    public static int[] decreamentarnumb(int[] numbers) {

        for (int i=0; i<numbers.length; i++){
            numbers[i]=(numbers[i]-1); //here numbers on ith index got minus by 1 and then return
        }
        return numbers;

    }
}