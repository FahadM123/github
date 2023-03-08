public class Practice1 {
    public static void main(String[] args) {
        System.out.println("Hello malik");

        int result = getSum(2, 3);
        int result1 = getDiff(8, 5);
        int result2 = getProd(2, 4);
        int result3 = getQot(10,4);
        printnumbers(4);
        printEvenNumbers(10);
        System.out.println("Sum of 2 and 3 is = " + result);
        System.out.println("Diff of 8 and 5 is = " + result1);
        System.out.println("Prod of 2 and 4 is = " + result2);
        System.out.println("Div of 10 and 4 is = " + result3);
    }

    public static void printnumbers(int n) {

        for (int i = 0; i <= n; i++) {
            System.out.println(i);
        }

    }
        public static void printEvenNumbers(int n){

            for(int i=0; i<=n; i++){
                if(i%2 == 0)
                    System.out.println(i);

                }

            }


    public static int getSum(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static int getDiff(int a, int b) {
        int diff = a - b;
        return diff;
    }

    public static int getProd(int a, int b) {
        int Prod = a * b;
        return Prod;
    }
    public static int getQot(int a,int b){
        int Qot = a / b;
        return Qot;
    }

}

