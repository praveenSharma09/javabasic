public class pallindromw {


        public static void main(String[] args) {

            String A = "madam";
            /* Enter your code here. Print output to STDOUT. */
            System.out.println(pallin(A));
        }
        static boolean pallin(String A){


            for(int i = 0; i<A.length()/2; i++){
                char start  = A.charAt(i);
                char end  = A.charAt(A.length()-1-i);
                if(start != end){
                    return false;}

            }
            return true;
        }
    }


